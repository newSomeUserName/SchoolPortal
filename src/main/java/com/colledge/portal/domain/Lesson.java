package com.colledge.portal.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "lessons")
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

    @ManyToMany
    @JoinTable(name = "enrollments",
            joinColumns = @JoinColumn(name = "lesson_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    public Set<User> users;

    protected Lesson(){}

    @PrePersist
    protected void generateUUID()
    {
        id = UUID.randomUUID();
    }
}


