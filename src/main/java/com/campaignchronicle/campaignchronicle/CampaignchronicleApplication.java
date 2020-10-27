package com.campaignchronicle.campaignchronicle;

import com.mongodb.client.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;



public class CampaignchronicleApplication {

	public static void main(String[] args) {
		String uri = "mongodb+srv://joe123:joe123@ccdata.oa2ck.mongodb.net/test?retryWrites=true&w=majority";
		try (MongoClient mongoClient = MongoClients.create(uri)){
			MongoIterable<String> strings = mongoClient.listDatabaseNames();
			MongoCursor<String> cursor = strings.cursor();
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}
		}
//		SpringApplication.run(CampaignchronicleApplication.class, args);
	}

}
