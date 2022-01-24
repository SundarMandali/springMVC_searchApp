package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {


	
	@RequestMapping("/complex")
	public String showForm()
	{
		return "complexForm";
	}
	
	@RequestMapping(path="/handleForm",method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student,BindingResult result)
	{
		if(result.hasErrors()) 
		{
			return"complexForm";
		}
		
		System.out.println(student);	
		return"complexFormOutput";
	}
}
