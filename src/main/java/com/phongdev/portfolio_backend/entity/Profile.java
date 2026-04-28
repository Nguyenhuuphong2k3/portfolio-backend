package com.phongdev.portfolio_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String title;
    private String avatarUrl;

    @Column(columnDefinition = "TEXT")
    private String bio;
}
