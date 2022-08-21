package com.example.AyrotekQuiz.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice//Controller advice sınıfları, uygulamamızdaki birden fazla veya tüm controller için exception handler yazmamıza izin verir
public class GeneralExceptionHandler {

    @ExceptionHandler(value={UserNotFoundException.class})
    public ResponseEntity<ErrorResponse> handleUserNotFoundException(UserNotFoundException e, WebRequest request){

        ErrorResponse errorResponse = new ErrorResponse(
                e.getMessage(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now(ZoneId.of("Z")),
                request.getDescription(false)
        );
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value={UserIsNotFoundException.class})
    public ResponseEntity<ErrorResponse> handleUserIsNotFoundException(UserIsNotFoundException e, WebRequest request){

        ErrorResponse errorResponse = new ErrorResponse(
                e.getMessage(),
                HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now(ZoneId.of("Z")),
                request.getDescription(false)
        );
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value={ProductNotFoundException.class})
    public ResponseEntity<ErrorResponse> handleProductNotFoundException(ProductNotFoundException e, WebRequest request){

        ErrorResponse errorResponse = new ErrorResponse(
                e.getMessage(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now(ZoneId.of("Z")),
                request.getDescription(false)
        );
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }


}