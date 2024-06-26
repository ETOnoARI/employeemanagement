//  com/example/employeemanagement/exception/VacationNotFoundException.java

package com.example.employeemanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class VacationNotFoundException extends RuntimeException {

    public VacationNotFoundException(Integer vacationId) {
        super(String.format("Vacation with id %d not found", vacationId));
    }
}