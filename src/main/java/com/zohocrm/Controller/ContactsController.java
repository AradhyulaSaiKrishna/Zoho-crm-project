package com.zohocrm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.zohocrm.DTO.SaveContactsDetails;

@Controller
public class ContactsController {
	@RequestMapping("/Contacts")
	public String saveContacts(SaveContactsDetails details,ModelMap modelMap) {
		modelMap.addAttribute("msg","lead is converted into contacts");
		return"ContactsSaved";
	}
	

}
