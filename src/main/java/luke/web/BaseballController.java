package luke.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseballController {
	
@GetMapping ("/baseball") 

public ModelAndView baseballgame(String guessed) { 
	ModelAndView mav = new ModelAndView("/baseball/result");
	mav.addObject("value", guessed);
	
	return mav;
}
}
