package com.example.AyrotekQuiz.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import java.time.ZonedDateTime;

@Getter
@AllArgsConstructor
public class ErrorResponse {
    private final String message;
    private final int status;
    private final HttpStatus error;
    private final ZonedDateTime timestamp;
    private final String path;
}
