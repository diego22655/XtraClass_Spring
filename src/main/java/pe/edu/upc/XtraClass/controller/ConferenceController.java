package pe.edu.upc.XtraClass.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pe.edu.upc.XtraClass.model.entity.Qualification;
import pe.edu.upc.XtraClass.model.entity.Reservation;
import pe.edu.upc.XtraClass.model.util.RequestQualification;
import pe.edu.upc.XtraClass.services.QualificationService;
import pe.edu.upc.XtraClass.services.ReservationService;

@Controller
@RequestMapping("/conference")
public class ConferenceController {
	
	@Autowired
	private QualificationService qualificationService;
	
	@Autowired
	private ReservationService reservationService;
	
//	@GetMapping
//	public String index(Model model) {
//		return "conference/index";
//	}
	
	@GetMapping("/{id}")
	public String index(Model model, @ModelAttribute("reservationSearch") Reservation reservationSearch, 
			@PathVariable("id") Integer id ) {
		try {
			Qualification qualification = new Qualification();
			model.addAttribute("qualification", qualification);
			Optional<Reservation> optional = reservationService.findById(id);
			if(optional.isPresent()) {
				model.addAttribute("reservation", optional.get());
				model.addAttribute("reservationSearch", reservationSearch);
				model.addAttribute("reservationId", id);
				return "conference/index";
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "redirect:/conference";
	}

	// -----------------New qualification----------------------
	
	
	@GetMapping("qualification")
	public String newqualificacion(Model model, @RequestParam Integer reservationId) {
		RequestQualification qualification = new RequestQualification();
		qualification.setReservationId(reservationId);
		model.addAttribute("qualification", qualification);
		model.addAttribute("reservationId", reservationId);
		return "conference/qualification";
	}

	@PostMapping("qualification")
	public String saveNew(Model model, @ModelAttribute("qualification") RequestQualification request) {
		try {
			Qualification objqualification = new Qualification();
			Reservation objreservation = new Reservation();
			objqualification.setNameQualification(request.getQualification());
			objreservation.setId(request.getReservationId());
			objqualification.setReservation(objreservation);
			qualificationService.create(objqualification);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "redirect:/";
	}
}
