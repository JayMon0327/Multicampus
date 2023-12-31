package com.multi.mongoDB;

import static com.mongodb.client.model.Filters.eq;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;
import java.util.concurrent.TimeUnit;
import org.bson.Document;

public class Mongo1 {

	public static void main(String[] args) {
		/*
		 * Requires the MongoDB Java Driver.
		 * https://mongodb.github.io/mongo-java-driver
		 */

		//JSON + 기능추가 ==> BSON객체
		Bson filter = eq("name", "Garry"); //{"name" : "Garry"}
		
		MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017/");
		MongoClient mongoClient = new MongoClient(uri);
		
		MongoDatabase database = mongoClient.getDatabase("shop2");
		MongoCollection<Document> collection = database.getCollection("memo");
		FindIterable<Document> result = collection.find(filter);
		System.out.println(result.first().getString("office"));
		System.out.println(result.first().getString("name"));
		System.out.println(result.first().getInteger("age"));
		System.out.println(result.first().getString("phone"));
		
	}

}


