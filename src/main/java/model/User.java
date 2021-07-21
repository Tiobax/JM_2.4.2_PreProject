package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", nullable = false, length = 15)
    private String firs_name;

    @Column(name = "last_name", nullable = false, length = 15)
    private String last_name;

    @Column(name = "age", nullable = false)
    private int age;
}
