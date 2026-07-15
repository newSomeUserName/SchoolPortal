package com.colledge.portal.application.enrolment.interfaces;

import com.colledge.portal.api.request.lesson.EnrollStudentRequest;

public interface EnrolmentService {
    void enrollStudent(EnrollStudentRequest enrollStudentRequest);
}
