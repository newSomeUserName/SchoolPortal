package com.colledge.portal.api.controller;

import com.colledge.portal.api.request.lesson.DeleteStudentRequest;
import com.colledge.portal.api.request.lesson.EnrollStudentRequest;
import com.colledge.portal.application.enrolment.interfaces.EnrolmentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.LinkedHashMap;
import java.util.Map;


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
    @DeleteMapping("/delete")
    public ResponseEntity<Void> removeStudent(@RequestBody @Valid DeleteStudentRequest deleteStudentRequest)
    {
        _enrolmentService.deleteStudent(deleteStudentRequest);
        return ResponseEntity.noContent().build();
    }

}
