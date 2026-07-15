package com.colledge.portal.api.request.lesson;

import lombok.NonNull;

import java.util.UUID;

public record DeleteStudentRequest(@NonNull UUID userId, @NonNull UUID lessonId){ }
