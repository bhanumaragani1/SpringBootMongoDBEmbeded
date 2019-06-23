package com.starter.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.starter.document.Product;
import com.starter.repository.ProdcutRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private ProdcutRepository repo;
	@Override
	public void run(String... args) throws Exception {

		repo.save(new Product(10, "A", 1.1));
		repo.save(new Product(11, "B", 2.2));
		repo.save(new Product(12, "C", 3.3));
		repo.save(new Product(13, "D", 4.4));
		
		System.out.println("-------------");
		repo.findAll().forEach(System.out::println);
	}

}
