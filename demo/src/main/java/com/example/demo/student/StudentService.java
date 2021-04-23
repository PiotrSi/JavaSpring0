package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return Stream.of(
                new Student(
                        1L,
                        "Piotr",
                        "email@",
                        LocalDate.of(2000, Month.APRIL,5),
                        21
                )
        ).collect(Collectors.toList());
    }
}
