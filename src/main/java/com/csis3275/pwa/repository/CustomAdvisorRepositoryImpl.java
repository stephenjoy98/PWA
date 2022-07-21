package com.csis3275.pwa.repository;

import com.csis3275.pwa.model.Advisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

public class CustomAdvisorRepositoryImpl implements CustomAdvisorRepository{
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public List<Advisor> getAllAdvisors() {
        return mongoTemplate.findAll(Advisor.class);
    }

    public void saveAll(final List<Advisor> advisors) {
        mongoTemplate.insertAll(advisors);
    }
}
