package com.proyecto.perneria.controller;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.proyecto.perneria.constant.ViewConstant;



@Controller
public class InicioController {
	
	private static final Log LOG =LogFactory.getLog(InicioController.class);

	@GetMapping("/login")
	public String showLoginForm(Model model,
			@RequestParam(name="error",required = false)String error,
			@RequestParam(name="logout", required = false)String logout) {
		LOG.info("METHOD: showLoginForm -- PARAMS: error="+error+", logout :"+logout);
		model.addAttribute("error",error);
		model.addAttribute("logout",logout);
		LOG.info("Returning to login view");
		return ViewConstant.LOGIN;
	}
	
	
	
	@GetMapping("/inicio")
	public String showInicio() {
		
		
		return "login3";
	}
	
	
	@GetMapping({"/loginsucces","/"})
	public String loginCheck() {
		
		
		System.out.println("entro al check");
		LOG.info("METHOD: logincheck");			
		LOG.info("Returning to contacts view");
		return "redirect:/inicio";

		
	}
}
