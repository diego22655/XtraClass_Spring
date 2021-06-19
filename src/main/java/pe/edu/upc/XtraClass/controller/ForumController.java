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

import pe.edu.upc.XtraClass.service.ForumService;

import pe.edu.upc.XtraClass.model.entity.Forum;

@Controller
@RequestMapping("/forum")
public class ForumController {
	@Autowired
	private ForumService forumService;

	@GetMapping	
	public String list(Model model) {
		try {
			List<Forum> forums = forumService.getAll();
			model.addAttribute("Forums",forums);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "layout/Forum";
	}	
		
	/*@GetMapping("{id}")		// GET: /region/{id}
		public String findById(Model model, @PathVariable("id") Integer id) {
			try {
				Optional<Forum> optional = forumService.findById(id);
				if (optional.isPresent()) {
					model.addAttribute("forum", optional.get());
					return "regions/view";
				}			
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
			return "redirect:/regions";
		}*/
		//--------Edit -----------------------------
	/*	@GetMapping("{id}/edit")	// GET: /region/{id}/edit
		public String editById(Model model, @PathVariable("id") Integer id) {
			try {
				Optional<Forum> optional = forumService.findById(id);
				if (optional.isPresent()) {
					model.addAttribute("forumEdit", optional.get());
					return "forum/edit";
				}			
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
			return "redirect:/forum";
		}

		@PostMapping("saveedit")	// POST: /region/saveedit
		public String saveEdit(Model model, @ModelAttribute("forumEdit") Forum forum) {		
			try {
				forumService.update(forum);
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}		
			return "redirect:/forum";
		}	
		// -----------------New----------------------
		@GetMapping("new")	// GET: /region/new
		public String newforum(Model model) {
			Forum forum = new Forum();
			model.addAttribute("forumNew", forum);
			return "forum";
		}
		@PostMapping("savenew")	// POST: /region/savenew
		public String saveNew(Model model, @ModelAttribute("forumNew") Forum forum) {		
			try {
				forumService.create(forum);
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}		
			return "redirect:/forum";
		}	
		//---------- Delete---------------
		@GetMapping("{id}/del")
		public String delForum(@PathVariable("id") Integer id ) {
			try {
				Optional<Forum> optional = forumService.findById(id);
				if (optional.isPresent()) {
					forumService.deleteById(id);
				}			
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
			return "redirect:/forum";
		}*/
}
