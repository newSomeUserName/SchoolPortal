package com.colledge.portal.infrastructure.persistence.lessons_repository;

import com.colledge.portal.domain.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LessonsRepository extends JpaRepository<Lesson, UUID> {
}
