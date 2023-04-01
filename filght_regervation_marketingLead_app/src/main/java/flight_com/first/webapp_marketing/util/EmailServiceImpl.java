package flight_com.first.webapp_marketing.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;



@Component
public class EmailServiceImpl implements EmailServices {

	
	
	@Autowired
  JavaMailSender JavaMailSender;
	
	
	@Override
	public void sendEmail(String to, String subject, String message) {
		
		
		SimpleMailMessage m=new SimpleMailMessage();
		m.setTo(to);
		m.setSubject(subject);
		m.setText(message);
		
		JavaMailSender.send(m);
		
	}

}
