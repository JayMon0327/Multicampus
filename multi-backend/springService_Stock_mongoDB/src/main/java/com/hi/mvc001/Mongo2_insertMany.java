package com.hi.mvc001;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;

public class Mongo2_insertMany {

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
			doc.append("pw", "1234");
			doc.append("name", "apple");
			doc.append("tel", "011");

			Document doc2 = new Document();
			doc2.append("id", "apple2");
			doc2.append("pw", "1111");
			doc2.append("name", "apple2");
			doc2.append("tel", "019");
			
			ArrayList<Document> list = new ArrayList<>();
			list.add(doc);
			list.add(doc2);
			
			table.insertMany(list);
			
			System.out.println("InsertMany success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
