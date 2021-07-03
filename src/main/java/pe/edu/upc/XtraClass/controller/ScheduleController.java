package pe.edu.upc.XtraClass.controller;

import java.util.List;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.XtraClass.model.entity.Reservation;
import pe.edu.upc.XtraClass.model.entity.Teacher;
import pe.edu.upc.XtraClass.services.ReservationService;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {

	@Autowired
	private ReservationService reservationService;
	
	@GetMapping
	public String list(Model model) {
		try {
			List<Reservation> reservations = reservationService.getAll();
			model.addAttribute("reservations", reservations);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "Schedule/schedule";
	}
}
