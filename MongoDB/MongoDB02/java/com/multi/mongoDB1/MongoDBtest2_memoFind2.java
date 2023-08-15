package com.multi.mongoDB1;


import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBtest2_memoFind2 {

	public static void main(String[] args) {
		//1. 몽고 DB에 연결
		MongoClient client = new MongoClient("localhost",27017);
		System.out.println("1.몽고 DB 프로그램에 연결성공.");
		
		//2. shop2에 연결
		MongoDatabase database= client.getDatabase("shop2");
		System.out.println("2.shop2 db로 연결성공.");
		
		//3. member 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3.member 컬렉션에 연결성공.");
		
		FindIterable<Document> list = collection.find(); // 전체검색
		ArrayList<MemoVO> result = new ArrayList<MemoVO>();
		for (Document document : list) {
			//System.out.println(document);
			MemoVO bag= new MemoVO();
			bag.setName(document.getString("name"));
			bag.setAge(document.getString("age"));
			bag.setOffice(document.getString("office"));
			bag.setPhone(document.getString("phone"));
			result.add(bag);
		}
		
		System.out.println(result); // 좌로 나열되는거 보기불편하니까 ! 
		for (MemoVO memoVO : result) { //반복문으로 나열하기
			System.out.println(memoVO);
		}
	}

}
