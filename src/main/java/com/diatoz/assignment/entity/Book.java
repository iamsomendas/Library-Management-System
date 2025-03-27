package com.diatoz.assignment.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
public class Book {
    @Id
    private Long id;

    @Column(nullable=false)
    private String title;

    @Column(nullable=false)
    private String author;
}
