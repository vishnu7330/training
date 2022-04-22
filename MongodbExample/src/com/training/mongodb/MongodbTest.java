package com.training.mongodb;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongodbTest {

	public static void main(String[] args) {

		try (
			// Connect to the MongoDB server
			MongoClient mongoClient = new MongoClient("localhost", 27017)) {

			// Create database
			MongoDatabase db = mongoClient.getDatabase("portal");

			// Create collection
			MongoCollection<Document> table = db.getCollection("students");

			// Create Document
			Document doc = new Document("name", "Peter John");
			doc.append("id", 12);
			doc.append("age", 20);
			doc.append("department", "Engineering");

			// Insert Data
			table.insertOne(doc);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
