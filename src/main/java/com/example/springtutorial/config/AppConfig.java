package com.example.springtutorial.config;

import com.example.springtutorial.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by AshoJa on 6/3/2016.
 */
@Configuration
public class AppConfig {

    @Bean
    public CustomerService getCustomerService() {
        return new CustomerService();
    }

}
