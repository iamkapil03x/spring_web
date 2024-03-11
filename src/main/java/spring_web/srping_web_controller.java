package spring_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class srping_web_controller {
 @RequestMapping("/")
 public String message() {
	 System.out.println("Message called.....");
	 return "Hello";
 }
}
