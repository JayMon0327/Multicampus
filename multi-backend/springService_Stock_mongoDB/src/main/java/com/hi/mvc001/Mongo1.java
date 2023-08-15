package com.hi.mvc001;



import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;

public class Mongo1 {

	public static void main(String[] args) {

		Bson filter = new Document("writer", "apple");
		Bson filter2 = new Document("name", -1);

		MongoClient mongoClient = new MongoClient(
		new MongoClientURI(
		    "mongodb://localhost:27017/"
		)
		);
		MongoDatabase database = mongoClient.getDatabase("shop2");
		MongoCollection<Document> collection = database.getCollection("memo");
		FindIterable<Document> result = collection.find(filter);
		System.out.println(result.first());
		System.out.println(result.first().containsKey("name"));
		System.out.println(result.first().containsValue("Peter John"));
		FindIterable<Document> result2 = result.sort(filter2);
		
		for (Document document : result2) {
			System.out.print(document.get("post_date") + " ");
			System.out.print(document.get("memo") + " ");
			System.out.print(document.get("writer") + " ");
			System.out.print(document.get("name") + " ");
			System.out.print(document.get("age") + " ");
			System.out.println();
		}
		
		//첫번째 document만 꺼내서,mysql로 넣어보자.!
	}
}
