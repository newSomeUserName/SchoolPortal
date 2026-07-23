package com.colledge.portal.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "teachers")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Teacher {
    @Id
    @Column(name = "user_guid")
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId
    @JoinColumn(name = "user_guid")
    private User user;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "teacher")
    @Builder.Default
    private Set<Lesson> lessons = new HashSet<>();


}
