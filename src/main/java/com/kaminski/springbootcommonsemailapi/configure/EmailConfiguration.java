package com.kaminski.springbootcommonsemailapi.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "api")
public class EmailConfiguration {

    private String email;
    private String password;
    private String hostname;
    private Boolean sslConnect;
    private Integer serverPort;

    public EmailConfiguration() {
    }

    public EmailConfiguration(String email, String password, String hostname, Integer serverPort, Boolean sslConnect) {
        this.email = email;
        this.password = password;
        this.hostname = hostname;
        this.serverPort = serverPort;
        this.sslConnect = sslConnect;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Boolean getSslConnect() {
        return sslConnect;
    }

    public void setSslConnect(Boolean sslConnect) {
        this.sslConnect = sslConnect;
    }

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public String toString() {
        return "EmailConfiguration{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", hostname='" + hostname + '\'' +
                ", sslConnect=" + sslConnect +
                ", serverPort=" + serverPort +
                '}';
    }
}