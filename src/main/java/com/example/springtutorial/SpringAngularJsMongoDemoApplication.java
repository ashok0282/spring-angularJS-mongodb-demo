package com.example.springtutorial;

import com.example.springtutorial.data.model.Customer;
import com.example.springtutorial.data.repository.CustomerRepository;
import com.example.springtutorial.service.CustomerService;
import com.example.springtutorial.util.MongoDBUtil;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
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

        repository.deleteAll();
        // save a couple of customers
        repository.save(customerService.createCustomer("Ashok", "Jaiswal"));
        repository.save(customerService.createCustomer("Bob", "Rowden"));
        repository.save(customerService.createCustomer("Alice", "Lara"));
        repository.save(customerService.createCustomer("Mona", "Gupta"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : repository.findAll()) {
            System.out.println("firstname:" + customer.getFirstName() + " lastname:" + customer.getLastName());
        }

        System.out.println();

        MongoCollection<Document> customers = MongoDBUtil.getMongoDatabase().getCollection("customer");

        System.out.println("Count of customers in collection:" + customers.count());

        FindIterable<Document> documents = customers.find();
        MongoCursor<Document> cursor = documents.iterator();
        while (cursor.hasNext()) {
            System.out.println(cursor.next().toJson());
        }


    }

}
