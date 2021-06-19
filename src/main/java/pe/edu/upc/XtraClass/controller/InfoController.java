package pe.edu.upc.XtraClass.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.XtraClass.model.entity.Teacher;
import pe.edu.upc.XtraClass.service.TeacherService;

@Controller
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("employee/{id}")
	public String viewEmployeeGet(Model model, @ModelAttribute("employeeSearch") Teacher employeeSearch, 
			@PathVariable("id") Integer id ) {
		try {
			Optional<Teacher> optional = teacherService.findById(id);
			if(optional.isPresent()) {
				model.addAttribute("teacher", optional.get());
				model.addAttribute("teacherSearch", employeeSearch);
				return "info/teacher";
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "redirect:/";
	}
}
