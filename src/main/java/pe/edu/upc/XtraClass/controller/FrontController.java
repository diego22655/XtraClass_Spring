package pe.edu.upc.XtraClass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FrontController {
	//GET y POST
	
	@GetMapping
	public String index(Model model) {
		return "index";
	}
	
		
	@GetMapping("layout")
	public String layout() {
		return "layout/layout";
	}
}
