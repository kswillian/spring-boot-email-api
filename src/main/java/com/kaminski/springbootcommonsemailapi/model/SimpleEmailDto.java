package com.kaminski.springbootcommonsemailapi.model;

public class SimpleEmailDto {

    private String from;
    private String to;
    private String subject;
    private String message;

    public SimpleEmailDto(String from, SimpleEmailForm simpleEmailForm) {
        this.from = from;
        this.to = simpleEmailForm.getTo();
        this.subject = simpleEmailForm.getSubject();
        this.message = simpleEmailForm.getMessage();
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

}