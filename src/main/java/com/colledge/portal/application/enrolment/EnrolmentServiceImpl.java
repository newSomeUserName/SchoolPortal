package com.colledge.portal.application.enrolment;

import com.colledge.portal.api.request.lesson.DeleteStudentRequest;
import com.colledge.portal.api.request.lesson.EnrollStudentRequest;
import com.colledge.portal.application.enrolment.interfaces.EnrolmentService;
import com.colledge.portal.infrastructure.persistence.lessons_repository.LessonsRepository;
import com.colledge.portal.infrastructure.persistence.user_repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnrolmentServiceImpl implements EnrolmentService {

    public final UserRepository _userRepository;
    public final LessonsRepository _lessonsRepository;
    public EnrolmentServiceImpl(UserRepository userRepository, LessonsRepository lessonsRepository)
    {
        _userRepository = userRepository;
        _lessonsRepository = lessonsRepository;
    }

    @Transactional
    public void enrollStudent(EnrollStudentRequest enrollStudentRequest)
    {
        var lesson = _lessonsRepository.findById(enrollStudentRequest.lessonId()).orElseThrow();
        var user = _userRepository.findById(enrollStudentRequest.userId()).orElseThrow();
        user.lessons.add(lesson);
    }
    @Transactional
    public void deleteStudent(DeleteStudentRequest deleteStudentRequest)
    {
        var lesson = _lessonsRepository.findById(deleteStudentRequest.lessonId()).orElseThrow();
        var user = _userRepository.findById(deleteStudentRequest.userId()).orElseThrow();
        lesson.users.remove(user);
    }

}
