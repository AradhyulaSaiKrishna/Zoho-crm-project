package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Leads;
import com.zohocrm.repositories.LeadsRepository;

@Service
public class LeadsServiceimpl implements LeadsService {

	@Autowired
	private LeadsRepository leadsRepo;

	@Override
	public void saveLeads(Leads lead) {
		leadsRepo.save(lead);
		
	}

	@Override
	public List<Leads> getAllLeads() {
		List<Leads> leads = leadsRepo.findAll();
		return leads;
	}

	@Override
	public Leads getLeadById(Long id) {
		Optional<Leads> findById = leadsRepo.findById(id);
		Leads lead = findById.get();
		return lead;
	}
	
	

	
	

	

}
