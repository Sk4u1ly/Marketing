package flight_com.marketing.first.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import flight_com.marketing.first.webapp.Dto.LeadDto;

@Controller
public class SearchLeadController {
	
	@Autowired
	private LeadRestClient restClient;
	
	@RequestMapping("/search")
	public String viewSearchLeadForm() {
		return "searchLead";
		
	}
	
	@RequestMapping("/findbyId")
   public String findById(@RequestParam("id") int id ,ModelMap modelMap) {
	  LeadDto leadDto = restClient.getLeadById(id);
	  modelMap.addAttribute("leadDto", leadDto);
	   
	   return"lead_info";
   }
}
