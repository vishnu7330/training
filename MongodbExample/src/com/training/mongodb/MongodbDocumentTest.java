package com.training.mongodb;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongodbDocumentTest {

	public static void main(String[] args) {

		CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
				fromProviders(PojoCodecProvider.builder().automatic(true).build()));

		try (MongoClient mongoClient = new MongoClient("localhost",
				MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build())) {

			// Create database
			MongoDatabase db = mongoClient.getDatabase("portal");

			// Create collection
			MongoCollection<Document> collection = db.getCollection("students");

			// Create Document
			Document document = new Document("name", "Peter John");
			document.append("age", 20);
			document.append("department", "Engineering");
			document.append("grade", "A");

			// create address
			Address address = new Address();
			address.setStreet("123, My Street");
			address.setCity("Kingston");
			address.setState("New York");
			address.setZipCode("12401");

			// append address
			document.append("address", address);

			// insert into MongoDB
			collection.insertOne(document);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
