package com.example.taskmanager.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean completed;

    // Každý task patrí jednému používateľovi
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

