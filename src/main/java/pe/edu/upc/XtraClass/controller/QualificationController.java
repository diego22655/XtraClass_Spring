package pe.edu.upc.XtraClass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.XtraClass.model.entity.ClassificationConsulting;
import pe.edu.upc.XtraClass.service.ClassificactionConsultingService;

@Controller
@RequestMapping("/qualification")
public class QualificationController {
	
	@Autowired
	private ClassificactionConsultingService classificactionConsultingService; 
	
	@GetMapping
	public String index(Model model) {
		return "qualification/index";
	}
	
	// -----------New--------------------
	@PostMapping("savenew")	// POST: /region/savenew
	public String saveNew(Model model, ClassificationConsulting qualification) {		
		try {
			classificactionConsultingService.create(qualification);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}		
		return "redirect:/index";
	}	
}
