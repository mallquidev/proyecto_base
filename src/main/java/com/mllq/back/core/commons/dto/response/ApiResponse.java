package com.mllq.back.core.commons.dto.response;

import java.util.List;

import com.mllq.back.core.commons.models.ApiError;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
    private List<ApiError> errors;
}

