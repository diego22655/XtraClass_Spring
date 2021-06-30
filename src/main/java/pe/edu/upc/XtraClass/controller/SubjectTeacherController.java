package pe.edu.upc.XtraClass.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.XtraClass.model.entity.SubjectTeacher;
import pe.edu.upc.XtraClass.model.entity.Teacher;
import pe.edu.upc.XtraClass.service.SubjectTeacherService;

@Controller
@RequestMapping("/info")
public class SubjectTeacherController {

	@Autowired
	private SubjectTeacherService subjectteacherService;
	
	/*@GetMapping("ClassRegister")
	public String viewSubjectTeacherGet(Model model, @ModelAttribute("subjectteacherSearch") SubjectTeacher subjectteacherSearch, 
			@PathVariable("teacher_id") Integer id ) {
		try {
			Optional<SubjectTeacher> optional = subjectTeacherService.findById(id);
			if(optional.isPresent()) {
				model.addAttribute("subjectteacher", optional.get());
				model.addAttribute("subjectteacherSearch", subjectteacherSearch);
				return "Register/ClassRegister";
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "redirect:/ClassRegister";
	}*/
	
	/*@GetMapping
	public String list(Model model) {
		try {
			List<SubjectTeacher> subjectteachers = subjectteacherService.getAll();
			model.addAttribute("subjectteachers", subjectteachers);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "Register/ClassRegister";
	}*/
	
	public String list(Map<String,Object> model) {
		model.put("listsubjectlist", subjectteacherService.listsubjectteacher());
		return "ClassReservations";
	}
}
