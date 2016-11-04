package dev.fringe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/")
	public String root(Model model){
		model.addAttribute("message", "Hello.");
		return "index";
	}
}