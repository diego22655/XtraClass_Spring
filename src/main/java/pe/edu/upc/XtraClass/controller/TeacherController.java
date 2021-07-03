package pe.edu.upc.XtraClass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.XtraClass.model.entity.Teacher;
import pe.edu.upc.XtraClass.services.TeacherService;

@Controller
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@GetMapping
	public String list(Model model) {
		try {
			List<Teacher> teachers = teacherService.getAll();
			model.addAttribute("teachers", teachers);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "reservation/teachers";
	}
}
