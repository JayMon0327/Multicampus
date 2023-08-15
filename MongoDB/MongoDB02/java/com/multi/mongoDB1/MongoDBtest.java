package com.multi.mongoDB1;


import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBtest {

	public static void main(String[] args) {
		//1. 몽고 DB에 연결
		MongoClient client = new MongoClient("localhost",27017);
		System.out.println("1.몽고 DB 프로그램에 연결성공.");
		
		//2. shop2에 연결
		MongoDatabase database= client.getDatabase("shop2");
		System.out.println("2.shop2 db로 연결성공.");
		
		//3. member 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("member");
		System.out.println("3.member 컬렉션에 연결성공.");
		
	}

}
