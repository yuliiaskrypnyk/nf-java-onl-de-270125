package org.example.Lombok;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@With
public class Student {
    private int id;
    private String name;
    private String address;
    private double grade;
}
