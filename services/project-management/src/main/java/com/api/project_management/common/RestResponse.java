package com.api.project_management.common;

import lombok.Data;

@Data
public class RestResponse<T> {
    private String message;
    private T data;
    private String errorCode;

    public RestResponse(String message, T data, String errorCode) {
        this.message = message;
        this.data = data;
        this.errorCode = errorCode;
    }
}
