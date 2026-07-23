package com.colledge.portal.application.auth;

import com.colledge.portal.api.request.auth.RegisterRequest;
import com.colledge.portal.application.auth.interfaces.RegisterService;
import com.colledge.portal.application.auth.port.PasswordHasher;
import com.colledge.portal.domain.User;
import com.colledge.portal.infrastructure.persistence.user_repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegisterServiceImpl implements RegisterService {

    private final UserRepository _userRepository;
    private final PasswordHasher _passwordHasher;

    public RegisterServiceImpl(UserRepository userRepository, PasswordHasher passwordHasher)
    {
        _userRepository = userRepository;
        _passwordHasher = passwordHasher;
    }

    @Override
    public UUID register(RegisterRequest registerRequest) {

        User user = User.builder().name(registerRequest.name()).surname(registerRequest.surname()).email(registerRequest.email()).passwordHash(_passwordHasher.hash(registerRequest.rawPassword())).userRole(registerRequest.userRole()).build();

        _userRepository.save(user);

        return user.uuid;
    }
}
