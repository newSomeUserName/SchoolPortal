package com.colledge.portal.api.request.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(@NotBlank @Size(max = 15) String name, @Size(max = 15) String surname, @Size(max = 100) String email,@Size(max = 72) @JsonProperty("password") String rawPassword) {
}
