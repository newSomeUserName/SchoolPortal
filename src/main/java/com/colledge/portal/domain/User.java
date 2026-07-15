package com.colledge.portal.domain;

import com.colledge.portal.domain.shared.UserRole;
import jakarta.persistence.*;
import lombok.*;


import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
@AllArgsConstructor
@Builder
@Getter
@Setter
public class User {
    @Id
    @Column(name = "user_guid",nullable = false)
    public UUID uuid;

    @Column(name = "user_number",length = 15)
    public String userNumber;
    @Column(name = "name",length = 50, nullable = false)
    public String name;
    @Column(name = "surname",length = 50, nullable = false)
    public String surname;
    @Column(name = "email",length = 100,nullable = false)
    public String email;

    @Column(name = "user_role",nullable = false)
    @Enumerated(EnumType.ORDINAL)
    public UserRole userRole;


    @ManyToMany
    @JoinTable(name = "enrollments",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "lesson_id"))
    public Set<Lesson> lessons;

    @PrePersist
    public void generateUUID()
    {
        uuid = UUID.randomUUID();
        userNumber = "Default";
        userRole = UserRole.Student;
    }

    protected User(){}



}
