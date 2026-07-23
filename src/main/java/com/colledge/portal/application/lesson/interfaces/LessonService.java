package com.colledge.portal.application.lesson.interfaces;

import com.colledge.portal.api.request.lesson.LessonAddRequest;
import com.colledge.portal.api.request.lesson.SetTeacherRequest;
import com.colledge.portal.domain.Lesson;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface LessonService {
    UUID addLesson(LessonAddRequest lessonAddRequest);
    Set<Lesson> getStudentLessons(UUID studentId);
    void setTeacher(SetTeacherRequest setTeacherRequest);

}
