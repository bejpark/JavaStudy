package com.edu.kosa;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
	
	@RequestMapping("/hi.bo")
	public ModelAndView hi() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("greeting", getGreeting());
		mav.setViewName("hi");
		return mav;
	}

	private Object getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(hour>=6 && hour<=11) {
			return hour+" 좋은아침";
		}else if(hour>=12 && hour <=15){
			return hour+" 점심 맛있게 드세요";
		}else if(hour>=18 && hour<=20) {
			return hour+" 편안한 저녁 되세요";
		}else {
			return hour+" go home";
		}
	}

}
