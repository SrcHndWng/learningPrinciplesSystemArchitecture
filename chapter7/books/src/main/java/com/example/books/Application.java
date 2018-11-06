package com.example.books;

import java.util.List;
import com.example.books.domain.BookSummary;
import com.example.books.repository.BookSummaryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	@Autowired
    private BookSummaryRepository repository;

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args)) {
            Application app = ctx.getBean(Application.class);
            app.run();
        } catch (Exception e) {
            System.out.println("Application Error!");
            e.printStackTrace();
        }
	}

	private void run() throws Exception {
		List<BookSummary> books = repository.getBookSummary();
		books.forEach(b -> {
			System.out.println(b.toString());
		});
	}
}
