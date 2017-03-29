package test.spring.sogeti;

import javax.servlet.http.HttpServletRequest;

import org.junit.runners.Parameterized.Parameters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/silly")
public class HelloWordController {

	//three ways for make the request into the controller
	//--------------------1.
	
	
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloword-form";
	}
	
	@RequestMapping("/proccesForm")
	public String showHello(){
		return "hello-word";
	}
	
	
	//-------------------2. 
	
	
	@RequestMapping("/proccesFormVersionTwo")
	public String showHelloVesionTwo(HttpServletRequest request, Model model){
		
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		String result = "Hey men i am "+ name;
		
		model.addAttribute("message", result);
		return "hello-word";
	}
	
	//-------------------3. 
	
	@RequestMapping("/proccesFormVersionThree")
	public String showHelloVesionThree(@RequestParam("studentName") String name, Model model){
		

		name = name.toUpperCase();
		String result = "Hey men i am "+ name;
		
		model.addAttribute("message", result);
		return "hello-word";
	}
}
