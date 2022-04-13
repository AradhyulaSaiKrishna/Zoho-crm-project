package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailUtilimpl implements EmailUtil {

	@Autowired
	private JavaMailSender emailsender;
	
	@Override
	public void sendEmail(String to, String subject, String emailBody) {
		SimpleMailMessage message=new SimpleMailMessage();
		
		message.setFrom("aradhyulasaikrishna@gmail.com");
		message.setTo(to);
		message.setSubject(subject);
		message.setText(emailBody);
		emailsender.send(message);
		
	}

}
