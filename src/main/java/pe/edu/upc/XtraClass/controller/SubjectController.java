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

import pe.edu.upc.XtraClass.model.entity.Subject;
import pe.edu.upc.XtraClass.services.SubjectService;

@Controller
@RequestMapping("/subjects")
@SessionAttributes("subjectsEdit")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	
	@GetMapping
	public String list(Model model) {
		try {
			List<Subject> subjects = subjectService.getAll();
			model.addAttribute("subjects", subjects);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "reservation/subjects";
	}
	
	@GetMapping("{id}")
	public String findById(Model model, @PathVariable("id") Integer id) {
		try {
			Optional<Subject> optional = subjectService.findById(id);
			if (optional.isPresent()) {
				model.addAttribute("subject", optional.get());
				return "reservation/view";
			}			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "redirect:/subjects";
	}
	
}
