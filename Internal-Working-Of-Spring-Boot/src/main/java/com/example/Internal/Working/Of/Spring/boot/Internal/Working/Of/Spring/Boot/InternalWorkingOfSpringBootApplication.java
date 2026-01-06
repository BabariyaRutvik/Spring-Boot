package com.example.Internal.Working.Of.Spring.boot.Internal.Working.Of.Spring.Boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalWorkingOfSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InternalWorkingOfSpringBootApplication.class, args);
	}


    /*
      Filled Depandency injection
     */
     // @Autowired
    private PaymentService service;

    /*
       Constructor depandancy injection
     */
    public InternalWorkingOfSpringBootApplication(StripeService service){
        this.service = service;

    }
    @Override
    public void run(String... args) throws Exception {
         String payment = service.pay();
        System.out.println("Payment Done : " + payment);


    }
}
