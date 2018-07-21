package io.yadnyesh.cardatabase.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(name="username",nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

    public User() {
    }

    public User(String userName, String password, String role) {

        this.userName = userName;
        this.password = password;
        this.role = role;
    }


}
