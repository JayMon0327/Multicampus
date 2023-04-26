package com.multi.mongoDB1;


import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBtest2_memoinsert {

	public static void main(String[] args) {
		//1. 몽고 DB에 연결
		MongoClient client = new MongoClient("localhost",27017);
		System.out.println("1.몽고 DB 프로그램에 연결성공.");
		
		//2. shop2에 연결
		MongoDatabase database= client.getDatabase("shop2");
		System.out.println("2.shop2 db로 연결성공.");
		
		//3. member 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3. member 컬렉션에 연결 성공.");
		
		Document doc = new Document();
		doc.append("age", "500");
		doc.append("name", "song");
		doc.append("office", "busan");
		doc.append("phone", "011");
		
		collection.insertOne(doc);
		System.out.println("4. member 컬렉션에 insertone 성공.");
	}

}
