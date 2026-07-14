package com.colledge.portal.application.lesson.interfaces;

import com.colledge.portal.api.request.lesson.LessonAddRequest;

import java.util.UUID;

public interface LessonService {
    UUID addLesson(LessonAddRequest lessonAddRequest);
}
