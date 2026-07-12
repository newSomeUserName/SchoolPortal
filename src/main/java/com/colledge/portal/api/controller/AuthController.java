package com.colledge.portal.api.controller;


import com.colledge.portal.api.request.LoginRequest;
import com.colledge.portal.api.request.RegisterRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {



    @PostMapping("/login")
    public ResponseEntity<Void> login(@Valid @RequestBody LoginRequest loginRequest)
    {
        return ResponseEntity.noContent().build();
    }


    @PostMapping("/register")
    public ResponseEntity<Void> register(@Valid @RequestBody RegisterRequest registerRequest)
    {
        return ResponseEntity.noContent().build();
    }
}
