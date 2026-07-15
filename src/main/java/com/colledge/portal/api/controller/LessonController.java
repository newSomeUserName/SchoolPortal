package com.colledge.portal.api.controller;


import com.colledge.portal.api.request.lesson.EnrollStudentRequest;
import com.colledge.portal.api.request.lesson.LessonAddRequest;
import com.colledge.portal.application.lesson.interfaces.LessonService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/lesson")
public class LessonController {

    private final LessonService _lessonService;

    public LessonController(LessonService lessonService)
    {
        _lessonService = lessonService;
    }

    @GetMapping("/{userId}")
    public String getStudentLessons(@PathVariable UUID userId) {

        return userId.toString();
    }


    @PostMapping("/add")
    public ResponseEntity<UUID> addLesson(@RequestBody @Valid LessonAddRequest lessonAddRequest) {
        UUID createdLessonId = _lessonService.addLesson(lessonAddRequest);
        return ResponseEntity.ok(createdLessonId);
    }


}
