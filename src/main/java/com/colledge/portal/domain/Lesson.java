package com.colledge.portal.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "lessons")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Lesson {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "frequency")
    private short frequency;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "teacher_id", nullable = false, foreignKey = @ForeignKey(name = "fk_lessons_teacher"))
    private Teacher teacher;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lesson")
    @Builder.Default
    private Set<Enrollment> enrollments = new HashSet<>();


    @PrePersist
    protected void generateUUID()
    {
        id = UUID.randomUUID();
    }
}


