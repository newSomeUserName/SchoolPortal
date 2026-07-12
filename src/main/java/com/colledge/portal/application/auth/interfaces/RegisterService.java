package com.colledge.portal.application.auth.interfaces;


import com.colledge.portal.api.request.RegisterRequest;

import java.util.UUID;

public interface RegisterService {
    UUID register(RegisterRequest registerRequest);
}
