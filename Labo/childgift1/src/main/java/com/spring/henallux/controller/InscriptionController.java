package com.spring.henallux.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.henallux.model.User;
import com.spring.henallux.service.HobbiesService;

	@Controller
	@RequestMapping(value="/userInscription")
	@SessionAttributes({InscriptionController.CURRENTUSER})
	public class InscriptionController {
		
		protected static final String CURRENTUSER = "currentUser";
		
		@ModelAttribute(CURRENTUSER)
		public User user(){
			return new User();
		}
		
		@Autowired
		private HobbiesService hobbiesService;

		@RequestMapping(method=RequestMethod.GET)
		public String home(Model model, @ModelAttribute(value=CURRENTUSER)User currentUser){			
			model.addAttribute("hobbies",hobbiesService.getListHobbies());
			model.addAttribute("userInscription", currentUser);
			return "integrated:userInscription";
		}
		
		@RequestMapping(value="/send", method=RequestMethod.POST)
		public String getFormData(Model model,
									@Valid @ModelAttribute(value=CURRENTUSER) User currentUser,
									final BindingResult errors){
			if(!errors.hasErrors()){
				
				model.addAttribute("name", currentUser);
				model.addAttribute("age",currentUser);
				model.addAttribute("male", currentUser);
				model.addAttribute("hobby",currentUser);
				
				//System.out.println(user.getName().toString());
				/*System.out.println(user.getAge().toString());
				System.out.println(user.getMale().toString());
				System.out.println(user.getHobby().toString());*/
				return "redirect:/gift";
			}
			else{
				return "integrated:userInscription";
			}
			
		}
	}
