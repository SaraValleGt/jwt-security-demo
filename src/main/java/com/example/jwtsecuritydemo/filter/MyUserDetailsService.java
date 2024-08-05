package com.example.jwtsecuritydemo.filter;

import org.springframework.security.core.userdetails.UserDetails;

public interface MyUserDetailsService {
    UserDetails loadUserByUsername(String username);
}
