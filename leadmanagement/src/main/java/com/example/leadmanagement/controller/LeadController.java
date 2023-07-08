package com.example.leadmanagement.controller;

import com.example.leadmanagement.model.Lead;
import com.example.leadmanagement.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leads")
public class LeadController {
	private final LeadService leadService;
	 @Autowired
	    public LeadController(LeadService leadService) {
	        this.leadService = leadService;
	    }
	 	
//	    @GetMapping("/{assignedTo}")
//	    public List<Lead> getLeadsByAssignedTo(@PathVariable String assignedTo) {
//	        return leadService.getAllLeadsByAssignedTo(assignedTo);
//	    }
	 	//display all leads
	 	@GetMapping("/all")
	 	public List<Lead> findAllLeads() {
	 		return leadService.findAllLeads();
	 	}
	 	//create lead
	    @PostMapping
	    public void createLead(@RequestBody Lead lead) {
	        leadService.createLead(lead);
	    }
	    //update lead status
	    @PutMapping("/{leadId}/status")
	    public void updateLeadStatus(@PathVariable String leadId, @RequestBody String status) {
	        leadService.updateLeadStatus(leadId, status);
	    }
	    
	    //delete
	    @DeleteMapping("/{id}/delete")
	    public void deleteLeadById(@PathVariable String id) {
	    	leadService.deleteLeadById(id);
	    }
	    //add note to lead
	    
}
