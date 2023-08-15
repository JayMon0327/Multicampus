package com.hi.mvc001;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOneModel;
import com.mongodb.client.model.Updates;

import org.bson.conversions.Bson;

public class Mongo2_updateMany {

	public static void main(String[] args) {

		try {
			// ---------- Connecting DataBase -------------------------//
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			// ---------- Creating DataBase ---------------------------//
			MongoDatabase db = mongoClient.getDatabase("shop2");
			// ---------- Creating Collection -------------------------//
			MongoCollection<Document> table = db.getCollection("member");
			// ---------- Creating Document ---------------------------//
//			Document doc = new Document();
//			doc.append("id", "apple");
//			
//			
			Bson doc = new Document("id", "apple");
			Bson doc2 = Updates.set("name", "winwinwin");
			
			//table.updateOne(filter, update)
			table.updateOne(doc, doc2);
			
			System.out.println("updateOne success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
