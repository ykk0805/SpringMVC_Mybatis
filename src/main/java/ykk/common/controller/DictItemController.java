package ykk.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ykk.common.domain.Dict;
import ykk.common.service.DictService;

@Controller
@RequestMapping(value = "/admin/dictItem")
public class DictItemController {
	
	@Autowired
	private DictService dictService;
	
	
	@RequestMapping(value= "/getDict" , method = RequestMethod.GET)
	@ResponseBody
	public String getDict (Long dictId) {
		Dict dict = dictService.getDict(dictId);
		StringBuffer sb = new StringBuffer();
		sb.append("<h6>").append(dict.getDictName()).append("</h6>");
		System.out.println(sb.toString());
		return sb.toString();
	}
}
