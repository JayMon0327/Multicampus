package com.multi.mongoDB;

import org.bson.BSON;
import org.bson.BsonArray;
import org.bson.BsonDocument;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Mongo3 {

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
			//{"id":"apple", "pw":"1234", "name" :"apple", "tel":"011"}
			//json --> document(BSON)
			Document doc = new Document();
			doc.append("id", "apple");
			doc.append("pw", "1234");
			doc.append("name", "apple");
			doc.append("tel", "011");
			
			collection.insertOne(doc);
			client.close();
			System.out.println("===== insertOne 성공 =====");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
