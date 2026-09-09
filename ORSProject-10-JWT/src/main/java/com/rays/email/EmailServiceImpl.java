package com.rays.email;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailServiceInt {
	
	@Autowired
	private JavaMailSender mailSender;

	@Override
	public void sendMail(EmailMessage msg) {
		try {
			
			// create a mime message
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		
		  // Helper for setting email properties
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
		
		// set and subject
		helper.setTo(msg.getTo());
		helper.setSubject(msg.getSubject());
		
		// condition di constentType me htmlType ka messsage hona chiye hu to true and nahi to false
		if(msg.getMessageType() == EmailMessage.HTML_MSG) {
			helper.setText(msg.getMessage(), true);
			
		}else {
			helper.setText(msg.getMessage(), false);
		}
		
		 // send mail
		mailSender.send(mimeMessage);
		
		}catch (Exception e) {
			System.out.println("Email Send Failed");
			e.printStackTrace();
			
			throw new RuntimeException("Email Could not be Send", e);
	}

	}
}
