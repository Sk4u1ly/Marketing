package flight_com.first.webapp_marketing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flight_com.first.webapp_marketing.entities.Lead;
import flight_com.first.webapp_marketing.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
private	LeadRepository leadRepo;
	
	
	@Override
	public void saveLead(Lead lead) {
	leadRepo.save(lead);
		
	}

	@Override
	public List<Lead> findAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public void deleteRecord(int id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public Lead findLeadBy(int id) {
	Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	
	
}
