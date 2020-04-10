package com.kaminski.springbootcommonsemailapi.service;

import com.kaminski.springbootcommonsemailapi.model.SimpleEmailDto;
import com.kaminski.springbootcommonsemailapi.model.SimpleEmailForm;

public interface EmailServiceInterface {

    SimpleEmailDto sendSimpleEmail(SimpleEmailForm simpleEmailForm);

}
