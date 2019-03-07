package com.cg.banking.aspect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.cg.banking.exceptions.AccountNotFoundException;


@ControllerAdvice
public class PayrollExceptionAspect {
    @ExceptionHandler(AccountNotFoundException.class)
    public ModelAndView handleAccountDetailNotfoundException(Exception e) {
        return new ModelAndView("findAccountDetailsPage", "errorMessage",e.getMessage());
    }
}

