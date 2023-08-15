package com.multi.mongoDB1;


import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBtest2_find {

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
		
		FindIterable<Document> list = collection.find(); // 전체검색
		ArrayList<MemberVO> result = new ArrayList<MemberVO>();
		for (Document document : list) {
			//System.out.println(document);
			MemberVO bag = new MemberVO();
			bag.setId(document.getString("id"));
			bag.setPw(document.getString("pw"));
			bag.setName(document.getString("name"));
			bag.setTel(document.getString("tel"));
			result.add(bag);
		}
		System.out.println(result);
	}

}
