package spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.modal.ContactForm;
import spring.mvc.service.ContactService;

@Controller
public class ContactControl {
	@Autowired
	private ContactService serviceCon;
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact() {
		return "contact";
	}

	
	@RequestMapping(value = "/submitContact", method = RequestMethod.POST)
	public String handler(@ModelAttribute ContactForm contact, Model model) {
		model.addAttribute("contact", contact);
		this.serviceCon.createContact(contact);
		return "success";
	}
	
	
	
	/*
	 * @RequestMapping(value = "/submitContact", method = RequestMethod.POST) public
	 * String handler(
	 * 
	 * @RequestParam("name") String userName,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("message") String mess, Model model) {
	 * System.out.println(userName + " , " + email + " , " + mess);
	 * model.addAttribute("name", userName); model.addAttribute("email", email);
	 * model.addAttribute("mess", mess); return "success"; }
	 */

}
