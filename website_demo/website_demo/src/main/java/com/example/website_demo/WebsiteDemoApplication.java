package com.example.website_demo;

import com.example.website_demo.Item.Item;
import com.example.website_demo.Item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsiteDemoApplication
		implements CommandLineRunner {

	@Autowired
	ItemRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(WebsiteDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Creating item...");
		Item item1 = new Item(1L,"book",9.99,4);

		repository.save(item1);

	}
}
