package com.example.sushiNowBe.aspect;

import com.example.sushiNowBe.model.ErrorResponseDto;
import org.springframework.http.HttpStatus;

import java.time.Instant;

public class ErrorResponseBuilder {

    private ErrorResponseDto.HttpStatusEnum httpStatusCode;
    private String message;

    public ErrorResponseBuilder badRequest() {
        this.httpStatusCode = ErrorResponseDto.HttpStatusEnum.NUMBER_400;
        return this;
    }

    public ErrorResponseBuilder notFound() {
        this.httpStatusCode = ErrorResponseDto.HttpStatusEnum.NUMBER_404;
        return this;
    }

    public ErrorResponseBuilder internalServerError() {
        this.httpStatusCode = ErrorResponseDto.HttpStatusEnum.NUMBER_500;
        return this;
    }

    public ErrorResponseBuilder message(String message) {
        this.message = message;
        return this;
    }

    public ErrorResponseBuilder setStatus(HttpStatus status) {
        this.httpStatusCode = ErrorResponseDto.HttpStatusEnum.fromValue(status.value());
        return this;
    }

    public ErrorResponseDto build() {
        ErrorResponseDto error = new ErrorResponseDto();
        error.setHttpStatus(httpStatusCode);
        error.setMessage(message);
        error.setTimeStamp(Instant.now().toString());
        return error;
    }
}
