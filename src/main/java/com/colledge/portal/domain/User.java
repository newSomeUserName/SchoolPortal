package com.colledge.portal.domain;

import com.colledge.portal.domain.shared.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(nullable = false)
    public UUID uuid;
    @Column(length = 15)
    public String userNumber;
    @Column(length = 50, nullable = false)
    public String name;
    @Column(length = 50, nullable = false)
    public String surname;
    @Column(nullable = false)
    public UserRole userRole;
    @Column(length = 100,nullable = false)
    public String email;


}
