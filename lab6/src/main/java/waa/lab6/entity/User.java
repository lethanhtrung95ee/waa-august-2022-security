package waa.lab6.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;
    private String password;
    private String firstname;
    private String lastname;

    //    @JsonBackReference
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Product> products;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable
    private List<Role> roles;

    private String prohibitedTimestamp;
    private int countSensitiveWords;
}
