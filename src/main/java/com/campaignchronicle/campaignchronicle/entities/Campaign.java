package com.campaignchronicle.campaignchronicle.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "campaigns")
public class Campaign {

    @Id
    private ObjectId id;
    private String name;
    private List<Users> participants;
    private Integer numberOfRounds;
}
