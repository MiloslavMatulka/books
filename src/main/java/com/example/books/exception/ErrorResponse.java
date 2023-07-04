package com.example.books.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorResponse {

    private LocalDateTime timestamp;
    private String message;
    private String description;
    private StackTraceElement[] stackTrace;

}
