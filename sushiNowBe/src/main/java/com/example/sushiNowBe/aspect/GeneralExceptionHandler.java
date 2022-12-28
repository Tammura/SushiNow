package com.example.sushiNowBe.aspect;


import com.example.sushiNowBe.model.ErrorResponseDto;
import exception.ConstrainsViolationException;
import exception.ResourceNotFoundException;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@NoArgsConstructor
@RestControllerAdvice
public class GeneralExceptionHandler {

    private final ErrorResponseBuilder builder = new ErrorResponseBuilder();

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = {ResourceNotFoundException.class})
    public ErrorResponseDto resourceNotFoundException(ResourceNotFoundException exception) {
        log.warn("Dealing with {}: reason is {}", exception.getClass().getSimpleName(), exception.getMessage());
        return builder.notFound().message(exception.getMessage()).build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = {ConstrainsViolationException.class})
    public ErrorResponseDto constrainsViolationException(ConstrainsViolationException exception) {
        log.warn("Dealing with {}: reason is {}", exception.getClass().getSimpleName(), exception.getMessage());
        return builder.badRequest().message(exception.getMessage()).build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = {HttpMessageNotReadableException.class})
    public ErrorResponseDto messageNotReadableException(HttpMessageNotReadableException exception) {
        log.info("Fallback to {} in {}", HttpMessageNotReadableException.class.getSimpleName(),
            GeneralExceptionHandler.class.getSimpleName());
        return builder.badRequest().message("Http message not readable").build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ErrorResponseDto methodArgumentNotValidException(MethodArgumentNotValidException exception) {

        FieldError fieldError = exception.getBindingResult().getFieldErrors().get(0);
        String message = fieldError.getField() + " " + fieldError.getDefaultMessage();
        log.warn("Dealing with {}: reason is {}", exception.getClass().getSimpleName(), message);
        return builder.badRequest().message(message).build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = HttpMediaTypeException.class)
    public ErrorResponseDto methodHttpMediaTypeException(HttpMediaTypeException exception) {

        log.warn("Dealing with {}: reason is {}", exception.getClass().getSimpleName(), exception.getMessage());
        return builder.badRequest().message(exception.getMessage()).build();
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponseDto exception(Exception exception) {
        log.error("Something unexpected happened ", exception);
        return builder.internalServerError().build();
    }
}
