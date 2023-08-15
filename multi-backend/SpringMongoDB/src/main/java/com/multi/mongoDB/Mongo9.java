package com.multi.mongoDB;

// Requires official Java MongoDB Driver 4.0+
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.bson.Document;
import org.bson.conversions.Bson;

public class Mongo9 {

	public static void main(String[] args) {

		try (MongoClient client = new MongoClient("localhost", 27017)) {

			MongoDatabase database = client.getDatabase("shop2");
			MongoCollection<Document> collection = database.getCollection("member");

			Consumer<Document> processBlock = new Consumer<Document>() {
				@Override
				public void accept(Document document) {
					System.out.println(document);
				}
			};

			List<? extends Bson> pipeline = Arrays
					.asList(new Document().append("$match", new Document().append("id", "apple2")));

			collection.aggregate(pipeline).allowDiskUse(false).forEach(processBlock);

		} catch (MongoException e) {
			// handle MongoDB exception
		}
	}

}
