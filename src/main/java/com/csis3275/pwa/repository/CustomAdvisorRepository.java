package com.csis3275.pwa.repository;

import com.csis3275.pwa.model.Advisor;
import java.util.List;

public interface CustomAdvisorRepository {
    List<Advisor> getAllAdvisors();

    void saveAll(final List<Advisor> advisors);
}
