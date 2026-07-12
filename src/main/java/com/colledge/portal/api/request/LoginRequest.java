package com.colledge.portal.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginRequest(@NotBlank @Size(max = 15) String userNumber, @NotBlank @JsonProperty("password") String rawPassword) {}
