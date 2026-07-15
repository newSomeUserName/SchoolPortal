package com.colledge.portal.api.controller;

import com.colledge.portal.api.request.lesson.EnrollStudentRequest;
import com.colledge.portal.application.enrolment.interfaces.EnrolmentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/enroll")
public class EnrollmentController {


    private final EnrolmentService _enrolmentService;

    public EnrollmentController(EnrolmentService enrolmentService)
    {
        _enrolmentService =enrolmentService;
    }

    @PostMapping("/add")
    public ResponseEntity<Void> enrollStudent(@RequestBody @Valid EnrollStudentRequest enrollStudentRequest)
    {
        _enrolmentService.enrollStudent(enrollStudentRequest);
        return ResponseEntity.noContent().build();
    }
}
