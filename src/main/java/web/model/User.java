package web.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", nullable = false)
    @NotEmpty(message = "first_name should not be empty")
    @Size(min = 2, max = 15, message = "first_name should not be between 2 and 15 characters")
    private String first_name;

    @Column(name = "last_name", nullable = false)
    @NotEmpty(message = "last_name should not be empty")
    @Size(min = 2, max = 15, message = "last_name should not be between 2 and 15 characters")
    private String last_name;

    @Column(name = "age")
    @Min(value = 0, message = "age should be greater than 0")
    private int age;

//    public User(String first_name, String last_name, int age) {
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.age = age;
//    }
}
