package com.campaignchronicle.campaignchronicle.repositories;

import com.campaignchronicle.campaignchronicle.entities.Campaign;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends MongoRepository<Campaign, ObjectId> {
}
