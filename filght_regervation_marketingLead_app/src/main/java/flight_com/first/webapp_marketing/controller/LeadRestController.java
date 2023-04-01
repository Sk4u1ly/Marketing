package flight_com.first.webapp_marketing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import flight_com.first.webapp_marketing.entities.Lead;
import flight_com.first.webapp_marketing.repository.LeadRepository;


@RestController
@RequestMapping("/api/leads")
public class LeadRestController {

	@Autowired
	LeadRepository leadRepo;
	

	@PostMapping                                                          // create
	public Lead saveLocation(@RequestBody Lead lead) {
		return leadRepo.save(lead);
		
	}
	@PutMapping                                                          // Update
	public Lead UpadteLocation(@RequestBody Lead lead) {
		return leadRepo.save(lead);
	
	}
	
	@GetMapping("/{id}")
	public Lead getOnelead(@PathVariable("id")Integer id) {                     
            Optional<Lead> findById = leadRepo.findById(id); // get
            Lead lead = findById.get();
            return lead;

}
	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id")Integer id) {       //  Delete
		leadRepo.deleteById(id);
		
		
	}

}