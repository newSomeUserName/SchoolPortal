package com.colledge.portal.api.response;

import java.util.UUID;

public record LessonResponse(UUID id, String name, byte frequency) { }
