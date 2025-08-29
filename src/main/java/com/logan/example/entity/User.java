package com.logan.example.entity;

import com.logan.example.enums.Status;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "user_table")
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode (of = "id")
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 120, unique = true)
    private String Name;

    @Column(length = 50)
    private String password;

    private Integer age;

    @Column(length = 11, unique = true)
    private String cpf;

    @Column(length = 100, unique = true)
    private String email;

    @Enumerated(EnumType.ORDINAL)
    private Status status = Status.INATIVE;
}
