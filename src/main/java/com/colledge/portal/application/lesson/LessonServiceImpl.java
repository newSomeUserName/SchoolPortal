package com.colledge.portal.application.lesson;

import com.colledge.portal.api.request.lesson.LessonAddRequest;
import com.colledge.portal.application.lesson.interfaces.LessonService;
import com.colledge.portal.domain.Lesson;
import com.colledge.portal.infrastructure.persistence.lessons_repository.LessonsRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class LessonServiceImpl implements LessonService {

    private final LessonsRepository _lessonRepository;
    public LessonServiceImpl(LessonsRepository lessonsRepository)
    {
        _lessonRepository = lessonsRepository;
    }

    @Override
    public UUID addLesson(LessonAddRequest lessonAddRequest) {
        Lesson lesson = Lesson.builder().name(lessonAddRequest.name()).frequency(lessonAddRequest.frequency()).build();
        _lessonRepository.save(lesson);
        return lesson.getId();
    }
}
