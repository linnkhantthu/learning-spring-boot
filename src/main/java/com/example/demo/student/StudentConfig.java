package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student linn = new Student(
                    "Linn Khant Thu",
                    "linnkhantthu@gmail.com",
                    LocalDate.of(1998, Month.JUNE, 1),
                    21
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1999, Month.JULY, 2),
                    21
            );
            repository.saveAll(
                    List.of(linn, alex)
            );
        };
    }
}
