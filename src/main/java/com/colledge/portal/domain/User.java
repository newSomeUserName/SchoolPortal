package com.colledge.portal.domain;

import com.colledge.portal.domain.shared.UserRole;
import jakarta.persistence.*;
import lombok.*;


import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class User {
    @Id
    @Column(name = "user_guid",nullable = false)
    private UUID id;

    @Column(name = "name",length = 50, nullable = false)
    private String name;

    @Column(name = "surname",length = 50, nullable = false)
    private String surname;

    @Column(name = "email",length = 100,nullable = false)
    private String email;

    @Column(name = "user_role",nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @Column(name = "password_hash",nullable = false)
    private String passwordHash;


    @PrePersist
    public void generateUUID()
    {
        id = UUID.randomUUID();
    }




}
