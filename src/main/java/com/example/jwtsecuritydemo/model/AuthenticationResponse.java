package com.example.jwtsecuritydemo.model;

public class AuthenticationResponse {
    private String token;

    // Constructor por defecto
    public AuthenticationResponse() {}

    // Constructor con parámetros
    public AuthenticationResponse(String token) {
        this.token = token;
    }

    // Getter y Setter
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
