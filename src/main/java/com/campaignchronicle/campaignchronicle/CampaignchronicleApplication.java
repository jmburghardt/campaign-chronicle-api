package com.campaignchronicle.campaignchronicle;

import com.mongodb.client.*;
import org.bson.Document;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


public class CampaignchronicleApplication {

	public static void main(String[] args) {
		String uri = "mongodb+srv://joe123:joe123@ccdata.oa2ck.mongodb.net/test?retryWrites=true&w=majority";
		try (MongoClient mongoClient = MongoClients.create(uri)){

			List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
			databases.forEach(document -> System.out.println(document.toJson()));
		}
//		SpringApplication.run(CampaignchronicleApplication.class, args);
	}

}
