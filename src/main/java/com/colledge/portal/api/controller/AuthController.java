package com.colledge.portal.api.controller;


import com.colledge.portal.api.request.auth.LoginRequest;
import com.colledge.portal.api.request.auth.RegisterRequest;
import com.colledge.portal.application.auth.interfaces.RegisterService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final RegisterService _registerService;

    public AuthController(RegisterService registerService)
    {
       _registerService = registerService;
    }

    @PostMapping("/login")
    public ResponseEntity<Void> login(@Valid @RequestBody LoginRequest loginRequest)
    {
        return ResponseEntity.noContent().build();
    }




    @PostMapping("/register")
    public ResponseEntity<UUID> register(@Valid @RequestBody RegisterRequest registerRequest)
    {
        UUID id = _registerService.register(registerRequest);
        return ResponseEntity.ok(id);
    }
}
