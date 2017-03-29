package test.spring.sogeti;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import test.spring.sogeti.models.user;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return home;
//	}
//	
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView  home(HttpServletRequest request,HttpServletResponse response ){
//		ModelAndView model = new ModelAndView("home"); // 
////		
//		String name = request.getParameter("name");
//		String pass = request.getParameter("pass");
//		
//		user u = new user();
//		u.setName(name);
//		u.setPassword(pass);
//	
//		model.addObject("dato", u); 
//		//request.setAttribute("dato", "kiss my asss please");
		
//		return model;
//	}	
	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView  homeLogin(HttpServletRequest request,HttpServletResponse response ){
		ModelAndView model = new ModelAndView("login"); // here was login
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		user u = new user();
		u.setName(name);
		u.setPassword(pass);
	
		model.addObject("dato", u); 
		//request.setAttribute("dato", "kiss my asss please");
		
		return model;
	}	
}
