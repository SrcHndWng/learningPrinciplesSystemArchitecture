package com.example.stateSample;

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
		StateTransitions stateTransitions = new StateTransitions();
		System.out.println("from accept to finish = " + stateTransitions.canTransit(State.accept, State.finish));
		System.out.println("from doing to review = " + stateTransitions.canTransit(State.doing, State.review));
	}
}
