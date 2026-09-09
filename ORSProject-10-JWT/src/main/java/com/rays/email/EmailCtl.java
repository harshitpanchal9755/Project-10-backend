
package com.rays.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Email")
public class EmailCtl {
	
	@Autowired
	EmailServiceInt emailservice;
	
	public String sendMail() {
		
		EmailMessage msg = new EmailMessage();
		
		msg.setTo("ca@gmail.com");
		msg.setSubject("SpringBoot send mail");
		msg.setMessage("Hello, Mail send SuccessFully");
		
		emailservice.sendMail(msg);
		
		return "Mail send SuccessFully";
		
	}
	
	

}
