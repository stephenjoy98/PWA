package com.csis3275.pwa.repository;


import com.csis3275.pwa.model.Advisor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AdvisorRepository extends MongoRepository<Advisor, String>,CustomAdvisorRepository {

}
