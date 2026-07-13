package com.colledge.portal.application.auth.port;

public interface PasswordHasher {
    String hash(String rawPassword);
    boolean verify(String rawPassword, String hashedPassword);
}
