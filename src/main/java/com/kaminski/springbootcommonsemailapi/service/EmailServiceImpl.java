package com.kaminski.springbootcommonsemailapi.service;

import com.kaminski.springbootcommonsemailapi.configure.EmailConfiguration;
import com.kaminski.springbootcommonsemailapi.model.SimpleEmailDto;
import com.kaminski.springbootcommonsemailapi.model.SimpleEmailForm;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailServiceInterface{

    @Autowired
    EmailConfiguration emailConfiguration;

    @Override
    public SimpleEmailDto sendSimpleEmail(SimpleEmailForm simpleEmailForm) {

        try{

            Email email = new SimpleEmail();
            email.setHostName(emailConfiguration.getHostname());
            email.setSmtpPort(emailConfiguration.getServerPort());
            email.setAuthenticator(new DefaultAuthenticator(emailConfiguration.getEmail(), emailConfiguration.getPassword()));
            email.setSSLOnConnect(emailConfiguration.getSslConnect());

            email.setFrom(emailConfiguration.getEmail());
            email.setSubject(simpleEmailForm.getSubject());
            email.setMsg(simpleEmailForm.getMessage());
            email.addTo(simpleEmailForm.getTo());
            email.send();

        }catch (Exception e){
            e.printStackTrace();
        }

        return new SimpleEmailDto(emailConfiguration.getEmail(), simpleEmailForm);

    }

}
