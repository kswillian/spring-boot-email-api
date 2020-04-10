package com.kaminski.springbootcommonsemailapi.controller;

import com.kaminski.springbootcommonsemailapi.model.SimpleEmailDto;
import com.kaminski.springbootcommonsemailapi.model.SimpleEmailForm;
import com.kaminski.springbootcommonsemailapi.service.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    EmailServiceImpl emailService;

    @PostMapping
    @RequestMapping("/simple")
    public ResponseEntity<SimpleEmailDto> sendSimpleEmail(@RequestBody @Valid SimpleEmailForm simpleEmailForm){
        SimpleEmailDto simpleEmailDto = emailService.sendSimpleEmail(simpleEmailForm);
        return ResponseEntity.status(HttpStatus.CREATED).body(simpleEmailDto);
    }

}