package com.incloud.hcp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Map;
import java.util.Properties;

//@Component("mailConfig")
public class MailConfiguration {

	@Bean
	public JavaMailSender getMailSender(Map<String, Object> smtpMapa) {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

		mailSender.setDefaultEncoding("UTF-8");
		mailSender.setHost(smtpMapa.get("host").toString());
		mailSender.setPort(Integer.valueOf(smtpMapa.get("port").toString()));
		mailSender.setUsername(smtpMapa.get("remitentEmail").toString());
		mailSender.setPassword(smtpMapa.get("password").toString());


		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "false");

		mailSender.setJavaMailProperties(javaMailProperties);
		return mailSender;
	}

	//TODO: TEMPORAL
	@Bean
	public JavaMailSender getMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

		mailSender.setDefaultEncoding("UTF-8");
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(Integer.valueOf(587));
		mailSender.setUsername("pprincipe.ti@gmail.com");
		mailSender.setPassword("Inicio01$$");


		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "false");
		javaMailProperties.put("mail.smtp.host", "smtp.gmail.com");

		mailSender.setJavaMailProperties(javaMailProperties);
		return mailSender;
	}

}
