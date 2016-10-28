package com.spring.henallux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.henallux.model.MagicKeyForm;

@Controller
@RequestMapping(value="/welcome")
public class WelcomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model){
		model.addAttribute("magicKeyForm", new MagicKeyForm ());
		return "integrated:welcome";
	}
	
	@RequestMapping(value="/send", method=RequestMethod.POST)
	public String getFormData(Model model,
								@ModelAttribute(value="magicKeyForm") MagicKeyForm form){
			String messageMagicKey = form.getMagicKey();
			if(messageMagicKey.equals("12345")){
				model.addAttribute("magicKey", messageMagicKey);
				return "redirect:/userInscription";
			}else{
				return "integrated:keyError";
		}
		
	}
}