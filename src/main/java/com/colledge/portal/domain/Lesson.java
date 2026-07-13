package com.colledge.portal.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "Lessons")
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Lesson {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "frequency")
    private byte frequency;

    protected Lesson(){}

    @PrePersist
    protected void generateUUID()
    {
        id = UUID.randomUUID();
    }
}


