package pe.edu.upc.XtraClass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/principal")
public class FrontController {
	//GET y POST
		
	@GetMapping
	public String principal() {
		return "master";
	}
}
