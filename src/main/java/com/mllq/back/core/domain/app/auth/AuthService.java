package com.mllq.back.core.domain.app.auth;

import com.mllq.back.core.commons.dto.response.ApiResponse;
import com.mllq.back.core.domain.core.dto.request.user.LoginRequest;
import com.mllq.back.core.domain.core.dto.request.user.RegisterUserRequest;
import com.mllq.back.core.domain.core.dto.response.user.AuthResponse;

public interface AuthService {
    ApiResponse<AuthResponse> register(RegisterUserRequest request);
    ApiResponse<AuthResponse> login(LoginRequest request);
}
