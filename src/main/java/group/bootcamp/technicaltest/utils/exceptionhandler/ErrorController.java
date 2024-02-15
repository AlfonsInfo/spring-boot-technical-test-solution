package group.bootcamp.technicaltest.utils.exceptionhandler;

import group.bootcamp.technicaltest.entities.schema.BaseResponse;
import group.bootcamp.technicaltest.utils.exception.CustomAuthException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.naming.AuthenticationException;
import java.util.Collections;
import java.util.List;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public BaseResponse<List<String>> constraintViolationException(ConstraintViolationException exception)
    {
        BaseResponse<List<String>> response = new BaseResponse<>();
        return response.failedResponse(Collections.emptyList(),null);
    }

    @ExceptionHandler(CustomAuthException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public BaseResponse<List<String>> authenticationException(CustomAuthException exception)
    {
        BaseResponse<List<String>> response = new BaseResponse<>();
        return response.failedResponse(Collections.emptyList(),exception.getMessage());
    }


}
