package com.training.mongodb;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;

public class MongodbPojoTest {

	public static void main(String[] args) {

		CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
				fromProviders(PojoCodecProvider.builder().automatic(true).build()));

		try (MongoClient mongoClient = new MongoClient("localhost",
				MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build())) {

			// Create database
			MongoDatabase db = mongoClient.getDatabase("portal");

			// Create collection -- specify java class type
			MongoCollection<Student> collection = db.getCollection("students", Student.class);

			Student student = new Student();

			student.setName("John Joseph");
			student.setAge(20);

			Address address = new Address();
			address.setStreet("456 Derrick Street");
			address.setCity("Boston");
			address.setState("MA");
			address.setZipCode("02130");

			student.setAddress(address);

			// insert into MongoDB
			collection.insertOne(student);
			
			//collection.deleteOne(Filters.eq("name", "Mike Sherrard"));

		}
	}

}
