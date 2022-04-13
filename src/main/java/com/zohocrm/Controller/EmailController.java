package com.zohocrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.zohocrm.services.EmailUtil;

@Controller
public class EmailController {
	
	@Autowired
	private EmailUtil emailutil;

	@RequestMapping("sendEmail")
	public String sendEmail(@RequestParam("email") String email ModelMap modelMap) {
		modelMap.addAttribute("email",email);
		return"composeEmail";
	}
	
	@RequestMappping("/Send")
	public String sendEmail(@Requestparam("toEmail") String to,@Requestparam("subject") String subjct,@Requestparam("emalBody")String emailBody) {
		emailutil.sendEmail(to,subject,emailBody);
		return"composeEmail";
	}
	
}
