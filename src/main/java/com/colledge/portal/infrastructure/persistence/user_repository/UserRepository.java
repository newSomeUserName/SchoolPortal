package com.colledge.portal.infrastructure.persistence.user_repository;

import com.colledge.portal.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
