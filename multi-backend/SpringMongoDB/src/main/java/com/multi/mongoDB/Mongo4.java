package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.BSON;
import org.bson.BsonArray;
import org.bson.BsonDocument;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Mongo4 {

	public static void main(String[] args) {
		try {
			// 1. 몽고DB에 연결
			MongoClient client = new MongoClient("localhost", 27017);
			
			// 2. shop3 db에 연결
			MongoDatabase database = client.getDatabase("shop2");
			
			// 3. member collection에 연결
			MongoCollection<Document> collection 
					= database.getCollection("member");

			// 4. crud(insertOne(document)
			Document doc = new Document();
			doc.append("id", "apple4");
			doc.append("pw", "1234");
			doc.append("name", "apple4");
			doc.append("tel", "014");
			
			Document doc2 = new Document();
			doc2.append("id", "apple5");
			doc2.append("pw", "1234");
			doc2.append("name", "apple5");
			doc2.append("tel", "015");
			
			List<Document> list = new ArrayList<Document>();
			list.add(doc);
			list.add(doc2);
			
			collection.insertMany(list);
			client.close();
			
			System.out.println("===== insertMany 성공 =====");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
