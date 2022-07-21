package com.csis3275.pwa.repository;

import com.csis3275.pwa.model.Advisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;

import java.util.List;

public class CustomAdvisorRepositoryImpl implements CustomAdvisorRepository{
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public List<Advisor> getAllAdvisors() {
        return mongoTemplate.findAll(Advisor.class);
    }

    public List<Advisor> getAdvisorsByRating(String rating) {
        return mongoTemplate.find(BasicQuery.query(Criteria.where("avg_rating").gte(rating)), Advisor.class);
    }

    public void saveAll(final List<Advisor> advisors) {
        mongoTemplate.insertAll(advisors);
    }
}
