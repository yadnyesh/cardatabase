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
}
