package com.mllq.back.core.domain.core.dto.response.user;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponse {
    private Long userId;
    private String username;
    private String email;
    private Integer dni;
    private List<String> roles;
}
