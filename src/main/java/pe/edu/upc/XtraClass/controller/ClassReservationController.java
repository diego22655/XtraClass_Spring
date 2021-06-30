package pe.edu.upc.XtraClass.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.XtraClass.model.entity.ClassReservation;
import pe.edu.upc.XtraClass.model.entity.SubjectTeacher;
import pe.edu.upc.XtraClass.model.entity.Teacher;
import pe.edu.upc.XtraClass.service.ClassReservationService;
import pe.edu.upc.XtraClass.service.SubjectTeacherService;
import pe.edu.upc.XtraClass.service.TeacherService;


@Controller
@RequestMapping("/info")
public class ClassReservationController {
	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private SubjectTeacherService subjectTeacherService;
	
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
	
	@GetMapping("{id}")		// GET: /region/{id}
	public String findById(Model model, @PathVariable("id") Integer id) {
		try {
			Optional<SubjectTeacher> optional = subjectTeacherService.findById(id);
			if (optional.isPresent()) {
				model.addAttribute("subjectteacher", optional.get());
				return "info/ClassReservations";
			}			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "redirect:/ClassReservations";
	}
	
	@GetMapping		// GET: /region
	public String list(Model model) {
		try {
			List<SubjectTeacher> subjectTeachers = subjectTeacherService.getAll();
			model.addAttribute("subjectTeachers", subjectTeachers);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "/ClassReservations";
	}
	
}
