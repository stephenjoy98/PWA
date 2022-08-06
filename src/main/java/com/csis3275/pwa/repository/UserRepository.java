package com.csis3275.pwa.repository;

import com.csis3275.pwa.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel, String> {
    UserModel findByEmail(String email);
}