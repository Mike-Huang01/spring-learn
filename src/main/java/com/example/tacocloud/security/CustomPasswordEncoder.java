package com.example.tacocloud.security;

import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence){
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s){
        return s.equals(charSequence.toString());
    }
}
