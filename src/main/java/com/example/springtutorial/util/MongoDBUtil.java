package com.example.springtutorial.util;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

/**
 * Created by AshoJa on 6/3/2016.
 */
public class MongoDBUtil {

    private static MongoDatabase mongoDatabase = null;

    static {

        MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));

        if (mongoClient == null) {
            System.out.println("Could not connect to the Mongo DB server....");
        }

        mongoDatabase = mongoClient.getDatabase("test");

    }


    public static MongoDatabase getMongoDatabase() {
        return mongoDatabase;
    }

}
