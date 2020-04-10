package com.kaminski.springbootcommonsemailapi.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SimpleEmailForm {

    @NotNull
    @NotEmpty
    private String to;

    @NotNull
    @NotEmpty
    private String subject;

    @NotNull
    @NotEmpty
    private String message;

    public SimpleEmailForm() {

    }

    public SimpleEmailForm(String to, String subject, String message) {
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
