package com.example.duedate;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

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
        final LocalDate nowDate = LocalDate.now();

        ShippingDueDate shippingDueDate = new ShippingDueDate(nowDate);
        System.out.println("ShippingDueDate remainingDays = " + shippingDueDate.remainingDays());

        PaymentDueDate paymentDueDate = new PaymentDueDate(nowDate);
        System.out.println("PaymentDueDate remainingDays = " + paymentDueDate.remainingDays());
	}
}
