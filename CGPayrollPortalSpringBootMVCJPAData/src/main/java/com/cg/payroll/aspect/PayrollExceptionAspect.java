package com.cg.payroll.aspect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.cg.payroll.exception.AssociateDetailNotfoundException;


@ControllerAdvice
public class PayrollExceptionAspect {
    @ExceptionHandler(AssociateDetailNotfoundException.class)
    public ModelAndView handleAssociateDetailNotfoundException(Exception e) {
        return new ModelAndView("findAssociateDetailsPage", "errorMessage",e.getMessage());
    }
}

