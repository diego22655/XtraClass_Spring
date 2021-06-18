package pe.edu.upc.XtraClass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/qualification")
public class QualificationController {
	
	@GetMapping
	public String index(Model model) {
		return "qualification/index";
	}
}
