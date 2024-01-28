package com.FlightReservationApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.FlightReservationApp.entity.User;
import com.FlightReservationApp.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	
	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "login/login";
	}
	@RequestMapping("/showReg")
	public String showRegistration() {
		return "login/RegistrationPage";
	}
	
	@RequestMapping("/saveReg")
	public String saveRegistration(@ModelAttribute("user") User user) {
		userRepository.save(user);
		return "login/login";
	}
	
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailId")String emailId, @RequestParam("password") String password, ModelMap model) {
		User user = userRepository.findByEmail(emailId);
		if(user!=null) {
			if(user.getEmail().equals(emailId)&& user.getPassword().equals(password)) {
				   return "findFlights";
				}else {
					model.addAttribute("error","invalid username / password");
					return "login/login";
				}
			}else {
				model.addAttribute("error","invalid username / password");
				return "login/login";
		}
		
	}
}
