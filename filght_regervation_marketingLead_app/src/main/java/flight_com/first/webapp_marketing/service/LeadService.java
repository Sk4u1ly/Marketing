package flight_com.first.webapp_marketing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import flight_com.first.webapp_marketing.entities.Lead;

@Service
public interface LeadService {

	public void saveLead(Lead lead);

    List<Lead>findAllLeads();

	public void deleteRecord(int id);

	

	public Lead findLeadBy(int id);
	
}
