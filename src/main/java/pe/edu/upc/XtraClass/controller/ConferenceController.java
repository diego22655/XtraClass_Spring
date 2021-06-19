package pe.edu.upc.XtraClass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.XtraClass.model.entity.ClassificationConsulting;
import pe.edu.upc.XtraClass.service.ClassificactionConsultingService;

@Controller
@RequestMapping("/conference")
public class ConferenceController {

	@Autowired
	private ClassificactionConsultingService classificactionConsultingService;

	@GetMapping
	public String index(Model model) {
		return "conference/index";
	}

	// -----------------New----------------------
	@GetMapping("qualification")
	public String newqualificacion(Model model) {
		ClassificationConsulting classificationConsulting = new ClassificationConsulting();
		model.addAttribute("classificationConsulting", classificationConsulting);
		return "conference/qualification";
	}

	@PostMapping("qualification")
	public String saveNew(Model model, @ModelAttribute("classificationConsulting") ClassificationConsulting classificationConsulting) {
		try {
			classificactionConsultingService.create(classificationConsulting);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "redirect:/";
	}
}
