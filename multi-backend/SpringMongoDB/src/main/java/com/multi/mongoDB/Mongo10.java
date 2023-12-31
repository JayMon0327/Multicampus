package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Mongo10 {

	public static void main(String[] args) {
		try {
			// 1. 몽고DB에 연결
			MongoClient client = new MongoClient("localhost", 27017);
			
			// 2. shop3 db에 연결
			MongoDatabase database = client.getDatabase("shop2");
			
			// 3. member collection에 연결
			MongoCollection<Document> collection 
					= database.getCollection("member");

			// 4. crud(deleteOne(document)
			//정렬조건
			//Document filter = new Document("name", 1);
			Document filter = new Document("name", -1);
			
			FindIterable<Document> result = collection.find().sort(filter);
			//iterate : 반복하다.
			//rs.next() 해서 반복해서 꺼내왔음.
			//반복해서 꺼낼 수 있는 타입의 객체 FindIterable
			//[doc, doc, doc, ....]
			System.out.print(result.first().get("id") + " ");
			System.out.print(result.first().get("pw") + " ");
			System.out.print(result.first().get("name") + " ");
			System.out.print(result.first().get("tel")  + "\n");
			//Document{{_id=6399308bbdce9c1be00b2156, id=apple2, pw=1234, name=winwinwin, tel=012}}
			System.out.println("======================================");
			ArrayList<Map> list = new ArrayList<Map>();
			for (Document doc : result) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("id", doc.get("id"));
				map.put("pw", doc.get("pw"));
				map.put("name", doc.get("name"));
				map.put("tel", doc.get("tel"));
				list.add(map);
//				System.out.print(doc.get("id") + "\t");
//				System.out.print(doc.get("pw") + "\t");
//				System.out.print(doc.get("name") + "\t");
//				System.out.print(doc.get("tel") + "\n");
			}
			System.out.println("======================================");
			System.out.println(list);
			System.out.println("===== find검색 성공 =====");
			
			//document와 제일 유사한 자바의 자료구조(map)
			//doc --> map
//			Map<String, Object> map = new HashMap<String, Object>();
//			map.put("id", result.first().get("id"));
//			map.put("pw", result.first().get("pw"));
//			map.put("name", result.first().get("name"));
//			map.put("tel", result.first().get("tel"));
//			System.out.println(map);
			
			client.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
