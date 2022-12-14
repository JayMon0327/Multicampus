package com.hi.mvc001;



import java.util.ArrayList;
import java.util.HashMap;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;

public class Mongo2_find_vo {

	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient(
		new MongoClientURI(
		    "mongodb://localhost:27017/"
		)
		);
		MongoDatabase database = mongoClient.getDatabase("shop2");
		MongoCollection<Document> collection = database.getCollection("member");
		FindIterable<Document> result = collection.find();

		ArrayList<MemberVO> list = new ArrayList<>();
		
		for (Document document : result) {
			MemberVO vo = new MemberVO();
			vo.setId(document.getString("id"));
			vo.setPw(document.getString("pw"));
			vo.setName(document.getString("name"));
			vo.setTel(document.getString("tel"));
			list.add(vo);
		}
		
		System.out.println("----------------");
		
		System.out.println(list);
		//첫번째 document만 꺼내서,mysql로 넣어보자.!
	}
}
