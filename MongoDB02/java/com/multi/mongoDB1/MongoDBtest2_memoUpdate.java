package com.multi.mongoDB1;


import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBtest2_memoUpdate {

	public static void main(String[] args) {
		//1. 몽고 DB에 연결
		MongoClient client = new MongoClient("localhost",27017);
		System.out.println("1.몽고 DB 프로그램에 연결성공.");
		
		//2. shop2에 연결
		MongoDatabase database= client.getDatabase("shop2");
		System.out.println("2.shop2 db로 연결성공.");
		
		//3. member 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3.memo 컬렉션에 연결성공.");
		
		//update할 조건은 document(json)으로 만들어주세요.)
		Document filter = new Document();
		filter.append("age", "501");
		//update할 내용은 bson(json)으로 만들어주세요.
		Bson set = Updates.set("name", "songsong");
		
		collection.updateOne(filter, set);
		System.out.println("4.memo 컬렉션에 update성공.");
	}

}
