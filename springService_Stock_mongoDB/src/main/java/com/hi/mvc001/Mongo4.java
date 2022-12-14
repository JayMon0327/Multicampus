package com.hi.mvc001;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Mongo4 {

	public static void main(String[] args) {

		try {
			// ---------- Connecting DataBase -------------------------//
			MongoClient mongoClient = new MongoClient("cluster0.8py0j10.mongodb.net", 27017);
			// ---------- Creating DataBase ---------------------------//
			MongoDatabase db = mongoClient.getDatabase("test");
			// ---------- Creating Collection -------------------------//
			MongoCollection<Document> table = db.getCollection("memo");
			// ---------- Creating Document ---------------------------//
			Document doc = new Document("name", "Peter John");
			doc.append("id", 12);
			// ----------- Inserting Data ------------------------------//
			System.out.println("1");
			table.insertOne(doc);
			System.out.println("2");
			System.out.println("insertOne success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
