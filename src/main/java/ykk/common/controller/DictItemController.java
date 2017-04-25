package ykk.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin/dictItem")
public class DictItemController {
	
	private static Logger log = Logger.getLogger(DictItemController.class);
	
	@RequestMapping(value= "/test" , method = RequestMethod.GET)
	public String Test (HttpServletRequest request,Model model) {
		System.out.println("1111111");
		return "index";
	}
}
