package com.example.fatezero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example"})
public class FateZeroApplication {

    public static void main(String[] args) {
        SpringApplication.run(FateZeroApplication.class, args);
    }

}
