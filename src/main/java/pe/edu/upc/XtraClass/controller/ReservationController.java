package pe.edu.upc.XtraClass.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.XtraClass.model.entity.Reservation;
import pe.edu.upc.XtraClass.model.entity.Scheadule;
import pe.edu.upc.XtraClass.model.entity.Student;
import pe.edu.upc.XtraClass.model.entity.Teacher;
import pe.edu.upc.XtraClass.model.util.RequestReservation;
import pe.edu.upc.XtraClass.services.ReservationService;
import pe.edu.upc.XtraClass.services.ScheaduleService;
import pe.edu.upc.XtraClass.services.TeacherService;



@Controller
@RequestMapping("/info")
public class ReservationController {
	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private ScheaduleService scheaduleService;
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("Reservations/{id}")
	public String viewTeacherGet(Model model, @ModelAttribute("teacherSearch") Teacher teacherSearch, 
			@PathVariable("id") Integer id ) {
		try {
			List<Scheadule> scheadules = scheaduleService.getAll();
			model.addAttribute("scheadules", scheadules);
			Optional<Teacher> optional = teacherService.findById(id);
			if(optional.isPresent()) {
				model.addAttribute("teacher", optional.get());
				model.addAttribute("teacherSearch", teacherSearch);
				return "reservation/Reservations";
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "redirect:/Reservations";
	}
	
	@PostMapping("Reservations/confirm")
	public String confirmReservation(Model model, @RequestBody RequestReservation body) {
		try {
			System.out.print(body);
			Reservation objReservation = new Reservation();
			Teacher objTeacher = new Teacher();
			Student objStudent = new Student();
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
			Date date = format.parse(body.getDate());
			objReservation.setDate(date);
			objReservation.setStartTime(body.getStarthour());
			objReservation.setEndTime(body.getFinishhour());
			objTeacher.setId(Integer.parseInt(body.getTeacherID()));
			objReservation.setTeacher(objTeacher);
			objStudent.setId(1);
			objReservation.setStudent(objStudent);
			reservationService.create(objReservation);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "redirect:/perfil";
	}
	
//	@GetMapping("{id}")		// GET: /reservation/{id}
//	public String findById(Model model, @PathVariable("id") Integer id) {
//		try {
//			Optional<Scheadule> optional = scheaduleService.findById(id);
//			if (optional.isPresent()) {
//				model.addAttribute("scheadule", optional.get());
//				return "reservation/Reservations";
//			}			
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.err.println(e.getMessage());
//		}
//		return "redirect:/Reservations";
//	}
	
	@GetMapping		// GET: /reservation
	public String list(Model model) {
		try {
			List<Scheadule> scheadules = scheaduleService.getAll();
			model.addAttribute("scheadules", scheadules);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "reservation/Reservations/{id}";
	}
	
}