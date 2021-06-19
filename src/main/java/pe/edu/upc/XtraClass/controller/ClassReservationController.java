package pe.edu.upc.XtraClass.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.XtraClass.model.entity.ClassReservation;
import pe.edu.upc.XtraClass.model.entity.Teacher;
import pe.edu.upc.XtraClass.service.ClassReservationService;
import pe.edu.upc.XtraClass.service.TeacherService;

@Controller
@RequestMapping("/info")
public class ClassReservationController {
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("ClassReservations/{id}")
	public String viewTeacherGet(Model model, @ModelAttribute("teacherSearch") Teacher teacherSearch, 
			@PathVariable("id") Integer id ) {
		try {
			Optional<Teacher> optional = teacherService.findById(id);
			if(optional.isPresent()) {
				model.addAttribute("teacher", optional.get());
				model.addAttribute("teacherSearch", teacherSearch);
				return "info/ClassReservations";
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "redirect:/ClassReservations";
	}
	
	/*@GetMapping
	public String list(Model model) {
		try {
			List<Teacher> teachers = teacherService.getAll();
			model.addAttribute("teachers", teachers);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "reservations/reservations";
	}*/
}
