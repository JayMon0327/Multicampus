package com.hi.mvc001;

import java.util.ArrayList;
import java.util.List;

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

public class Mongo2_updateOne {

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
			Document doc = new Document();
			doc.append("pw", "1111");
			doc.append("tel", "019");
			
			List<Bson> list = new ArrayList<Bson>();
			list.add(Updates.set("pw", "5555"));
			list.add(Updates.set("tel", "5555"));
			
			Bson doc2 = Updates.combine(list);
			
			//table.updateOne(filter, update)
			table.updateOne(doc, doc2);
			
			System.out.println("updateOne success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
