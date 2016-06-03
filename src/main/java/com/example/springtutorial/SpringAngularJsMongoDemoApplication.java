package com.example.springtutorial;

import com.example.springtutorial.data.model.Customer;
import com.example.springtutorial.data.repository.CustomerRepository;
import com.example.springtutorial.service.CustomerService;
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
        repository.save(customerService.createCustomer());

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : repository.findAll()) {
            System.out.println(customer);
        }

        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Ashok'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Ashok"));

        System.out.println("Customers found with findByLastName('Jaiswal'):");
        System.out.println("--------------------------------");
        for (Customer customer : repository.findByLastName("Jaiswal")) {
            System.out.println(customer);
        }

    }

}
