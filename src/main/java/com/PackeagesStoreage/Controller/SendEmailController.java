package com.PackeagesStoreage.Controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PackeagesStoreage.SendEmailApplication;


@RestController
public class SendEmailController {

	
	@Autowired
	SendEmailApplication sendingEmailApplication;

	@RequestMapping(value = "/sendemail")
	public String send() throws AddressException, MessagingException, IOException {
	   //sendEmail();
		sendingEmailApplication.sendEmailWithAttachment();
	   return "Email sent successfully";   
	}
}
