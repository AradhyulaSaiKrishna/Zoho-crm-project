package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Leads;
import com.zohocrm.services.LeadsService;

@Controller
public class LeadsController {
	
	@Autowired
	private LeadsService leadsservice;

	@RequestMapping("/leads")
	public String showLeadspage() {
		return"createLeads";
	}
	
	@RequestMapping("/saveLead")
	public String saveLeadsInfo(@ModelAttribute("leads") Leads leads,ModelMap modelMap) {
		leadsservice.saveLeads(leads);
		modelMap.addAttribute("msg","lead is saved!!!");
		return"createLeads";
		
	}
	
	@RequestMapping("/getleads")
	public String getLeads(ModelMap modelMap) {
		
		List<Leads> leads = leadsservice.getAllLeads();
		modelMap.addAttribute("leads",leads);
		return"searchResults";
	}
	@RequestMapping("getLeadInfo")
	public String getLeadsInfo(@RequestParam("id")Long id,ModelMap modelMap) {
		Leads lead = leadsservice.getLeadById(id);
		modelMap.addAttribute("lead", lead);
		return"leadInfo";
	}
}
}
