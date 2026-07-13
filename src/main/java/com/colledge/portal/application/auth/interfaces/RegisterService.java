package com.colledge.portal.application.auth.interfaces;


import com.colledge.portal.api.request.auth.RegisterRequest;

import java.util.UUID;

public interface RegisterService {
    UUID register(RegisterRequest registerRequest);
}
