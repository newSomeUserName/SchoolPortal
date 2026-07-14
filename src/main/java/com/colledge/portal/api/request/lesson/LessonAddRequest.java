package com.colledge.portal.api.request.lesson;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;
import lombok.NonNull;

public record LessonAddRequest(@NonNull @Size(max = 100) String name, @NonNull @Max(128) Byte frequency)  {}
