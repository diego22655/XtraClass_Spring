package pe.edu.upc.XtraClass.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.XtraClass.model.entity.Incidence;
import pe.edu.upc.XtraClass.model.entity.Topic;
import pe.edu.upc.XtraClass.services.IncidenceService;
import pe.edu.upc.XtraClass.services.TopicService;


@Controller
@RequestMapping("/incidences")
public class IncidenceController {
	
	@Autowired
	private IncidenceService incidenceService;
	
	@Autowired
	private TopicService topicService;
	
	/*@GetMapping// GET: /reservation
	public String list(Model model) {
		try {
			List<Incidence> incidences = incidenceService.getAll();
			model.addAttribute("Incidences", incidences);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "incidences/list";
	}*/
	
	@GetMapping("/list")
	public String listIncidence(Model model) {
		try {
			List<Incidence> incidences = incidenceService.getAll();
			model.addAttribute("incidences", incidences);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "incidences/list";
	}
	

		@GetMapping("new")
		public String newincidence(Model model) throws Exception {
			Incidence incidence = new Incidence();
			model.addAttribute("incidenceNew", incidence);
			List<Topic> topics = topicService.getAll();
			model.addAttribute("topics", topics);
			return "incidences/new";
		}
		@PostMapping("savenew")
		public String saveNew(Model model, @ModelAttribute("incidenceNew") Incidence incidence) {		
			try {
				incidenceService.create(incidence);
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}		
			return "redirect:/incidences/list";
		}	
		

		@GetMapping("{id}/del")
		public String delIncidence(@PathVariable("id") Integer id ) {
			try {
				Optional<Incidence> optional = incidenceService.findById(id);
				if (optional.isPresent()) {
					incidenceService.deleteById(id);
				}			
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
			return "redirect:/incidences/list";
		}
	
}
