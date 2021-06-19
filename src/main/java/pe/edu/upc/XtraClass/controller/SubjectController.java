package pe.edu.upc.XtraClass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.XtraClass.model.entity.Subject;
import pe.edu.upc.XtraClass.service.SubjectService;

@Controller
@RequestMapping("/search")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	
	@PostMapping("subjects")	
	public String searchSubjects(Model model , @ModelAttribute("subjectSearch") Subject subjectSearch) {
		System.out.println("LLEGO");
		List<Subject> subjects = null;
		try {
			subjects = subjectService
					.findByName(subjectSearch.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("subjects", subjects);
		model.addAttribute("subjectSearch", subjectSearch);
		return "search/schedule";
	}
	
}

	
