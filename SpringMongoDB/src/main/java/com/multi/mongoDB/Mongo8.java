package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.BSON;
import org.bson.BsonArray;
import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class Mongo8 {

	public static void main(String[] args) {
		try {
			// 1. 몽고DB에 연결
			MongoClient client = new MongoClient("localhost", 27017);
			
			// 2. shop3 db에 연결
			MongoDatabase database = client.getDatabase("shop2");
			
			// 3. member collection에 연결
			MongoCollection<Document> collection 
					= database.getCollection("member");

			// 4. crud(updateOne(document)
			//업데이트할 조건
			Document filter = new Document();
			filter.append("id", "apple4");
			
			//업데트할 내용이 많은 경우, 
			//-------------------------
			//1) Bson객체로 각각을 만든다.
			Bson update = Updates.set("name", "happy");
			Bson update2 = Updates.set("tel", "5555");
			
			//2) Bson객체의 list를 만든다.
			List<Bson> list = new ArrayList<>();
			list.add(update);
			list.add(update2);
			
			//3) list를 Bson로 만들어준다.
			Bson all = Updates.combine(list);
			
			//updateOne(bson, bson) --> updateOne(json, json)
			collection.updateOne(filter, all);
			client.close();
			System.out.println("===== updateOne 성공 =====");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
