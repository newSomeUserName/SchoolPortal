package com.colledge.portal.api.controller;


import com.colledge.portal.api.request.lesson.EnrollStudentRequest;
import com.colledge.portal.api.request.lesson.LessonAddRequest;
import com.colledge.portal.api.response.LessonResponse;
import com.colledge.portal.application.lesson.interfaces.LessonService;
import com.colledge.portal.domain.Lesson;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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

        return "fadhjlkfhaskjfdh";
    }


    @PostMapping("/add")
    public ResponseEntity<UUID> addLesson(@RequestBody @Valid LessonAddRequest lessonAddRequest) {
        UUID createdLessonId = _lessonService.addLesson(lessonAddRequest);
        return ResponseEntity.ok(createdLessonId);
    }

    @GetMapping("/getall/{id}")
    public ResponseEntity<List<LessonResponse>> getAllStudentLessons(@PathVariable UUID id){
        Set<Lesson> lessons = _lessonService.getStudentLessons(id);
        var lessonsResponse = lessons.stream().map(l->new LessonResponse(l.getId(),l.getName(),l.getFrequency())).toList();
        return ResponseEntity.ok(lessonsResponse);
    }



}
