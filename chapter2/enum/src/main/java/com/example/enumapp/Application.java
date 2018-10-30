package com.example.enumapp;

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
		Yen yen = feeFor("adult");
        System.out.println("yen = " + yen.value());

        FeeType adult = FeeType.valueOf("adult");
        FeeType child = FeeType.valueOf("child");
        FeeType senior = FeeType.valueOf("senior");
        Reservation reservation = new Reservation();
        reservation.addFee(adult.fee());
        reservation.addFee(child.fee());
        reservation.addFee(senior.fee());
        System.out.println("feeTotal = " + reservation.feeTotal().value());
    }
    
    private Yen feeFor(String feeTypeName){
        FeeType feeType = FeeType.valueOf(feeTypeName);
        return feeType.yen();
    }
}
