package com.example.springtutorial;

import com.example.springtutorial.data.repository.CustomerRepository;
import com.example.springtutorial.service.CustomerService;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAngularJsMongoDemoApplication implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(SpringAngularJsMongoDemoApplication.class);

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private CustomerService customerService;

    public static void main(String[] args) {
        logger.info("Starting Spring Angular JS MongoDB application main............");
        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SpringApplication.run(SpringAngularJsMongoDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        MongoClient c = new MongoClient();
        MongoDatabase db = c.getDatabase("test");
        MongoCollection<Document> animals = db.getCollection("animals");

        Document animal = new Document("animal", "monkey");

        animals.insertOne(animal);
        animal.remove("animal");
        animal.append("animal", "cat");
        animals.insertOne(animal);
        animal.remove("animal");
        animal.append("animal", "lion");
        animals.insertOne(animal);


    }

}
