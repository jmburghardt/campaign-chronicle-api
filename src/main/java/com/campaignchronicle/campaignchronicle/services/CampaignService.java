package com.campaignchronicle.campaignchronicle.services;

import com.campaignchronicle.campaignchronicle.entities.Campaign;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CampaignService extends MongoDBConfig {

    public static String CAMPAIGNS = "campaigns";

    private MongoCollection<Document> campaignsCollection;

    @Autowired
    public CampaignService(
            MongoClient mongoClient, @Value("${spring.data.mongodb.database}") String databaseName) {
        super(mongoClient, databaseName);
        campaignsCollection = db.getCollection(CAMPAIGNS);
    }

    public void createNewCampaign(Campaign campaign) {
        campaignsCollection.insertOne(convertToDocument(campaign));
    }

    public void updateCampaign(Campaign campaign) {
        Bson query = new Document("name", campaign.getName());
        campaignsCollection.updateOne(query, new Document("$set", convertToDocument(campaign)));
    }

    private Document convertToDocument(Campaign campaign) {
        Document campaignDoc = new Document();
        campaignDoc.put("name", campaign.getName());
        campaignDoc.put("participants", campaign.getParticipants());
        campaignDoc.put("number_of_rounds", campaign.getNumberOfRounds());
        return campaignDoc;
    }
}
