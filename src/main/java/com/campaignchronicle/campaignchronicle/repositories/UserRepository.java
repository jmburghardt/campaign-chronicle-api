package com.campaignchronicle.campaignchronicle.repositories;

import com.campaignchronicle.campaignchronicle.entities.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<Users, String> {
    List<Users> findAll();
}
