package com.example.leadmanagement.service;

import com.example.leadmanagement.model.Lead;
import com.example.leadmanagement.repository.LeadRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.List;

@Service
public class LeadService {
	private LeadRepository leadRepository=null;

    @Autowired
    public void LeadServiceImpl(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }
//
//    public List<Lead> getAllLeadsByAssignedTo(String assignedTo) {
//        // Implement your logic using leadRepository methods
//        return leadRepository.findByAssignedTo(assignedTo);
//    }

    public void createLead(Lead lead) {
        // Implement your logic using leadRepository methods
        leadRepository.save(lead);
    }
    
    public List<Lead> findAllLeads() {
		return leadRepository.findAll();
	}

    public void updateLeadStatus(String leadId, String status) {
        Lead lead = leadRepository.findById(leadId).orElse(null);
        if (lead != null) {
            lead.setStatus(status);
            leadRepository.save(lead);
      }
//    	Optional<Lead> optional= leadRepository.findById(leadId);
//    	Lead lead= optional.get();
//    	lead.setStatus(status);
//    	leadRepository.save(lead);
    }

	public void deleteLeadById(String id){
		leadRepository.deleteById(id);
	}
}
