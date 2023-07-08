package com.example.leadmanagement.repository;

import com.example.leadmanagement.model.Lead;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LeadRepository extends MongoRepository<Lead, String>{

}
