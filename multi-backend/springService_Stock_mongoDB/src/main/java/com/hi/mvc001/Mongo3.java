package com.hi.mvc001;

import static com.mongodb.client.model.Filters.eq;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;
import java.util.concurrent.TimeUnit;
import org.bson.Document;

public class Mongo3 {
	public static void main(String[] args) {

		/*
		 * Requires the MongoDB Java Driver. https://mongodb.github.io/mongo-java-driver
		 */

		Bson filter = eq("id", "apple");

		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017/"));
		MongoDatabase database = mongoClient.getDatabase("shop2");
		MongoCollection<Document> collection = database.getCollection("member");
		FindIterable<Document> result = collection.find(filter);
		System.out.println(result.first().getString("id"));
	}
}
