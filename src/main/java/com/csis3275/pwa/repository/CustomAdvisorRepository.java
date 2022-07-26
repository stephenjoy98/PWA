package com.csis3275.pwa.repository;

import com.csis3275.pwa.model.Advisor;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomAdvisorRepository {
    List<Advisor> getAllAdvisors();

    void saveAll(final List<Advisor> advisors);

    @Query("{avg_rating : { $gte : ?0 }}")
    List<Advisor> getAdvisorsByRating(String rating);
}
