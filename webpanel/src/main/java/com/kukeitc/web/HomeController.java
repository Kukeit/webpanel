package com.kukeitc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public  String simple(Model model){
		model.addAttribute("msg", "message");
		return "showMessage";
	}
}
