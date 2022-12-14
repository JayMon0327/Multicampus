package com.hi.mvc001;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;

public class Mongo2_deleteOne {

	public static void main(String[] args) {

		try {
			// ---------- Connecting DataBase -------------------------//
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			// ---------- Creating DataBase ---------------------------//
			MongoDatabase db = mongoClient.getDatabase("shop2");
			// ---------- Creating Collection -------------------------//
			MongoCollection<Document> table = db.getCollection("member");
			// ---------- Creating Document ---------------------------//
			Document doc = new Document();
			doc.append("id", "apple");
			
			table.deleteOne(doc);
			
			System.out.println("deleteOne success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
