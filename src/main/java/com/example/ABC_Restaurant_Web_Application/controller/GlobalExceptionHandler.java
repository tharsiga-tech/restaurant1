//package com.example.ABC_Restaurant_Web_Application.controller;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.NoHandlerFoundException;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(NoHandlerFoundException.class)
//    public String handle404(NoHandlerFoundException e, Model model) {
//        model.addAttribute("error", "Page not found");
//        return "error/404";  // Return a custom 404 error page
//    }
//
//    // You can add more exception handlers here if needed
//}