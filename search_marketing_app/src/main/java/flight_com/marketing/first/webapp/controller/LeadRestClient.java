package flight_com.marketing.first.webapp.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import flight_com.marketing.first.webapp.Dto.LeadDto;

@Component
public class LeadRestClient {

	public LeadDto getLeadById(int id) {
		RestTemplate  restTemplate =new RestTemplate();
	LeadDto leadDto = restTemplate.getForObject("http://localhost:8080/api/leads/"+id, LeadDto.class);
	return leadDto;
	
		
	}
}
