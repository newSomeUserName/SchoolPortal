package com.colledge.portal.domain;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Student {
    @Id
    @Column(name = "user_guid")
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId
    @JoinColumn(name = "user_guid")
    private User user;

    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY)
    @Builder.Default
    private Set<Enrollment> enrollments =new HashSet<>();


}
