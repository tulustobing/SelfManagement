package com.self.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
@ComponentScan("com.self.management")
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class SelfManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelfManagementApplication.class, args);
	}
	
	//For Autowired session factory
	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() {
	    return new HibernateJpaSessionFactoryBean();
	}
}
