package spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeControler {
	/*
	 * @RequestMapping(value = "/contact", method = RequestMethod.GET) public String
	 * contact() { return "contact"; }
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("Name", "kausar Raza");
		List<String> list = new ArrayList<String>();
		list.add("Kausar Raza Ansari");
		list.add("Rozi Khatun");
		list.add("FaizuRahman");
		list.add("NoorJahan");

		model.addAttribute("family", list);
		// This method handles requests for the home page ("/") and returns the view
		// name
		// In this example, assuming you have a "home.jsp" file in the "/WEB-INF/views/"
		// directory
		return "index";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
		return "about";
	}
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String profile(Model model) {
    	model.addAttribute("Name", "Kausar Raza");
    	model.addAttribute("Email", "Faizraza349@gmail.com");
    	model.addAttribute("Num", "8052738480");
    	model.addAttribute("Course", "B.Tech CSE");
    	
    	List<Integer> marks = new ArrayList<Integer>();
    	marks.add(88);
    	marks.add(86);
    	marks.add(89);
    	marks.add(99);
    	model.addAttribute("marks",marks);
		return "profile";
	}
    

}
