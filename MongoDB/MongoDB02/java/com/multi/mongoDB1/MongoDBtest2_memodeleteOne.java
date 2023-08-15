package com.multi.mongoDB1;


import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBtest2_memodeleteOne {

	public static void main(String[] args) {
		//1. 몽고 DB에 연결
		MongoClient client = new MongoClient("localhost",27017);
		System.out.println("1.몽고 DB 프로그램에 연결성공.");
		
		//2. shop2에 연결
		MongoDatabase database= client.getDatabase("shop2");
		System.out.println("2.shop2 db로 연결성공.");
		
		//3. member 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3. memo 컬렉션 연결 성공.");
		
		//삭제할 조건을 json(Document)로 만들어주세요.
		Document filter = new Document();
		filter.append("age", "500");
		
		collection.deleteOne(filter);
		client.close();
		System.out.println("4.deleteOne 성공");
		
	}

}
