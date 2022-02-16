package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.metamodel.ListAttribute;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args ->
        {
            Student leah = new Student(
                    "Leah",
                    "leah@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 3)

            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2021, Month.JANUARY, 9)
            );

            repository.saveAll(
                    List.of(leah, alex)
            );
        };
    }
}


