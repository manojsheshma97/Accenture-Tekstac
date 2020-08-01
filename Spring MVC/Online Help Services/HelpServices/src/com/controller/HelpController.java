package com.controller;
import com.model.*;
import com.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.validation.BindingResult;
import org.springframework.ui.ModelMap;
import java.util.*;

@Controller
public class HelpController {
	@Autowired
	private HelperService helpService;
	
	@RequestMapping(value="/showpage",method=RequestMethod.GET)
	public String showPage(@ModelAttribute("helper") HelperBean helper, BindingResult result){
	    return "showpage";
	}
	@RequestMapping(value="/helpdesk", method=RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("helper") HelperBean helper,ModelMap model,BindingResult result){
	    double cost=helpService.calculateTotalCost(helper);
	    model.addAttribute("cost",cost);
	    return "helpdesk";
	}
	
	@ModelAttribute("serviceList")
	public Map<String,String> buildState(){
	    Map<String,String> map=new HashMap<String,String>();
	    map.put("ACService","ACService");
	    map.put("WashingMachineService","WashingMachineService");
	    map.put("RefrigeratorService","RefrigeratorService");
	    return map;
	}
}
