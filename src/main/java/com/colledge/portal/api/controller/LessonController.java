package com.colledge.portal.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/lesson")
public class LessonController {


    @GetMapping("/{userId}")
    public String getStudentLessons(@PathVariable UUID userId) {

        return userId.toString();
    }
}
