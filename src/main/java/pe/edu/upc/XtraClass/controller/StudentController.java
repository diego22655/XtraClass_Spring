package pe.edu.upc.XtraClass.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.XtraClass.model.entity.Student;
import pe.edu.upc.XtraClass.services.StudentService;

@Controller
@RequestMapping("/students")
@SessionAttributes("studentsEdit")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public String list(Model model) {
		try {
			List<Student> students = studentService.getAll();
			model.addAttribute("students", students);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "Schedule/students";
	}
	
	
}
