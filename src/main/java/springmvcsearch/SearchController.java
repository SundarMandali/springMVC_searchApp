package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	//USING @PathVariable annotation here
	@RequestMapping("/user/{userid}/{username}")
	public String getUserdetails(@PathVariable("userid") int userid,@PathVariable("username") String username)
	{
		System.out.println("The userid provided by you is "+userid);
		System.out.println("The username provided by you is "+username);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("This is home view");
		return "home";
	}
	@RequestMapping("/home2")
	public String home2()
	{
		System.out.println("This is home2 view");
		return "home2";
	}
	@RequestMapping("/excep")
	public String excptnTesting()
	{
		String s=null;
		System.out.println(s.length());
		return "home";
	}
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query)
	{
		RedirectView redirectView=new RedirectView();
		if(query.isBlank())
			redirectView.setUrl("home");
		else
		{
		String url="https://www.google.com/search?q="+query;
		
		redirectView.setUrl(url);
		}
		return redirectView;
	}
	
	@RequestMapping("/welcome")
	public String welcomeHandler(@RequestParam("user") String name,Model m)
	{
	System.out.println("The user is "+name);
	m.addAttribute("name",name);
	return "welcome";
	}
	

	
}
