package org.example.Lombok;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    int id;
    String name;
    Teacher teacher;
    List<Student> students;
}
