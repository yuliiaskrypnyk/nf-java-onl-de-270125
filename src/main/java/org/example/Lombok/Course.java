package org.example.Lombok;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@With
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}
