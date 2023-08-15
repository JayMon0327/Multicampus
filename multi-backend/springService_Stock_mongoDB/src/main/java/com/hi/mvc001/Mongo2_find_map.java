package com.hi.mvc001;



import java.util.HashMap;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;

public class Mongo2_find_map {

	public static void main(String[] args) {

		//Bson filter = new Document("writer", "apple");
		//필터조건
		Bson filter2 = new Document("name", 1);
		//Bson filter2 = new Document("name", -1);

		MongoClient mongoClient = new MongoClient(
		new MongoClientURI(
		    "mongodb://localhost:27017/"
		)
		);
		MongoDatabase database = mongoClient.getDatabase("shop2");
		MongoCollection<Document> collection = database.getCollection("member");
		FindIterable<Document> result = collection.find().sort(filter2);
		System.out.println("----------------");
		System.out.println(result.first());
		System.out.println(result.first().containsKey("name"));
		System.out.println(result.first().containsValue("Peter John"));
		System.out.println("----------------");
		//if(re)
		for (Document document : result) {
			System.out.print(document.get("id") + "\t");
			System.out.print(document.get("pw") + "\t ");
			System.out.print(document.get("name") + "\t ");
			System.out.print(document.get("tel") + "\t ");
			System.out.println();
		}
		//hashmap에 넣어보자. -->vo를 이용해 넣어보자.
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", result.first().get("id"));
		map.put("pw", result.first().get("pw"));
		map.put("name", result.first().get("name"));
		map.put("tel", result.first().get("tel"));
		System.out.println("----------------");
		
		System.out.println(map);
		//첫번째 document만 꺼내서,mysql로 넣어보자.!
	}
}
