package com.colledge.portal.application.lesson;

import com.colledge.portal.api.request.lesson.LessonAddRequest;
import com.colledge.portal.api.request.lesson.SetTeacherRequest;
import com.colledge.portal.application.lesson.interfaces.LessonService;
import com.colledge.portal.domain.Lesson;
import com.colledge.portal.domain.shared.UserRole;
import com.colledge.portal.infrastructure.persistence.lessons_repository.LessonsRepository;
import com.colledge.portal.infrastructure.persistence.user_repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.UUID;


@Service
public class LessonServiceImpl implements LessonService {

    private final LessonsRepository _lessonRepository;
    private final UserRepository _usersRepository;
    public LessonServiceImpl(LessonsRepository lessonsRepository, UserRepository userRepository)
    {
        _usersRepository = userRepository;
        _lessonRepository = lessonsRepository;
    }

    @Override
    public UUID addLesson(LessonAddRequest lessonAddRequest) {
        Lesson lesson = Lesson.builder().name(lessonAddRequest.name()).frequency(lessonAddRequest.frequency()).build();
        _lessonRepository.save(lesson);
        return lesson.getId();
    }


    @Override
    @Transactional
    public void setTeacher(SetTeacherRequest setTeacherRequest) {
        var user = _usersRepository.findById(setTeacherRequest.userId()).orElseThrow();
        if (user.userRole == UserRole.Student){
//            throwExeption
        }
        var lesson = _lessonRepository.findById(setTeacherRequest.lessonId()).orElseThrow();

        user.lessons.add(lesson);
    }

    @Override
    public Set<Lesson> getStudentLessons(UUID studentId) {
        var user = _usersRepository.findById(studentId).orElseThrow();
        return user.lessons;
    }
}
