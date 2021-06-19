package pe.edu.upc.XtraClass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.XtraClass.model.entity.Subject;
import pe.edu.upc.XtraClass.service.SubjectService;

@Controller
@RequestMapping("/")


public class FrontController {
	
	@Autowired
	private SubjectService SubjectService;
	@GetMapping
	public String index(Model model) {
			Subject  subjectSearch= new Subject();
			model.addAttribute("classreservationSearch", subjectSearch);
		return "index";
	}
	
		
	@GetMapping("schedule")
	public String layout() {
		return "schedule/schedule";
	}
}
