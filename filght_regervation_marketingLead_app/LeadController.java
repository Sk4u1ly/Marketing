package flight_com.first.webapp_marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import flight_com.first.webapp_marketing.entities.Lead;
import flight_com.first.webapp_marketing.service.LeadService;
import flight_com.first.webapp_marketing.util.EmailServices;


@Controller
public class LeadController {

	
	@Autowired
	private LeadService leadService;
	
	
	@Autowired
	private EmailServices emailServices;
	
	
	@RequestMapping("/Register")
	public String viewlayer() {
		return "Register";
		
	}
	
	
	//@RequestMapping("/savelead")
	//public String saveOneLead(Lead lead) {
	//	System.out.println(lead.getId());
	//	System.out.println(lead.getFirstname());
//           System.out.println(lead.getLastname());
//		System.out.println(lead.getEmail());
//		System.out.println(lead.getMobile());
		
//		return "showFile";
		
//	}
	
//  @RequestMapping("/savelead")  
//  public String saveOneLead(Lead lead) {
// 	leadService.saveLead(lead);	
//	return "showFile";
    	

 @RequestMapping("/saveLead")
public String saveOne(@ModelAttribute("lead")Lead lead ,ModelMap modelMap ) {
	 emailServices.sendEmail(lead.getEmail(), "Test", "Welcome");
      leadService.saveLead(lead);
    modelMap.addAttribute("msg", "Record is saved!!!!");
    return "Register";
    
	  }

 @RequestMapping("/List_data")
 public String findLeads(ModelMap modelMap) {
 	List<Lead> leads = leadService.findAllLeads();
 	modelMap.addAttribute("leads", leads);
 	return "List_data";
 }

@RequestMapping("/Delete")
public String deleteOneLead(@RequestParam("id")int id,ModelMap modelMap) {
	leadService.deleteRecord(id);
	List<Lead> leads = leadService.findAllLeads();
	modelMap.addAttribute("leads", leads);
	return "List_data"; 
}

@RequestMapping("/Update")
public String UdateLeadById(@RequestParam("id")int id,ModelMap modelMap) {
	Lead lead = leadService.findLeadBy(id);
	modelMap.addAttribute("lead", lead);
	return "Update_data";
	
}

@RequestMapping("/updateLead")
public String Update(@ModelAttribute("lead") Lead lead ,ModelMap modelMap ) {
  leadService.saveLead(lead);
	List<Lead> leads = leadService.findAllLeads();
 	modelMap.addAttribute("leads", leads);
 	return "List_data";
}
}

	
	

