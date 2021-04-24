package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student piotr = new Student(
                    "Piotr",
                    "email@",
                    LocalDate.of(2000, APRIL, 5)

            );

            Student Alex = new Student(
                    "Alex",
                    "Alexemail@",
                    LocalDate.of(2001, APRIL, 2)


            );

            repository.saveAll(
                    Stream.of(piotr,Alex).collect(Collectors.toList())
            );
        };
    }
}
