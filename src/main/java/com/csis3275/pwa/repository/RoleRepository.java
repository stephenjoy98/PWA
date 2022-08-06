package com.csis3275.pwa.repository;

import com.csis3275.pwa.model.RoleModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<RoleModel, String> {
    RoleModel findByRole(String role);
}
