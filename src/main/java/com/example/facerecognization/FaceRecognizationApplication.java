package com.example.facerecognization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jimtse")
public class FaceRecognizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaceRecognizationApplication.class, args);
    }

}
