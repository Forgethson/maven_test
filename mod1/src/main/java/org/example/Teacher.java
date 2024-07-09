package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Teacher {
    private String name;
    private int age;
    private String department;
    private String position;

    private List<Student> students;
}
