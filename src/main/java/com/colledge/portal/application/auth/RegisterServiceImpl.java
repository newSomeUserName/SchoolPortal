package com.colledge.portal.application.auth;

import com.colledge.portal.api.request.RegisterRequest;
import com.colledge.portal.application.auth.interfaces.RegisterService;
import com.colledge.portal.domain.User;
import com.colledge.portal.infrastructure.persistence.user_repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegisterServiceImpl implements RegisterService {

    private final UserRepository _userRepository;

    public RegisterServiceImpl(UserRepository userRepository)
    {
        _userRepository = userRepository;
    }

    @Override
    public UUID register(RegisterRequest registerRequest) {

        User user = User.builder().name(registerRequest.name()).surname(registerRequest.surname()).email(registerRequest.email()).build();
         _userRepository.save(user);
         return user.uuid;
    }
}
