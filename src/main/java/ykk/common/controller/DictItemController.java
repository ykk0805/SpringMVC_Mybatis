package ykk.common.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ykk.common.domain.Upload;
import ykk.common.service.DictService;

@Controller
@RequestMapping(value = "/admin/dictItem")
public class DictItemController {
	
	@Autowired
	private DictService dictService;
	
	private final static Logger logger = LoggerFactory.getLogger(DictItemController.class); 
	
	@RequestMapping(method = RequestMethod.GET)
	public String getDict (Model model) {
		
		List<Upload> uploadList = dictService.listAll();
		logger.error(String.valueOf(uploadList.size()));
		System.out.println(String.valueOf(uploadList.size()));
//		String name = "应康康";
//		logger.error("error Logback 成功了");
//		model.addAttribute("name", name);
		model.addAttribute("uploadList", uploadList);
		return "imageView";
	}
}
