/*
package com.example.diplom.security;

import com.example.diplom.services.PersonDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class AuthProviderImpl implements AuthenticationProvider {

    private final PersonDetailsService personDetailsService;
    @Autowired
    public AuthProviderImpl(PersonDetailsService personDetailsService) {
        this.personDetailsService = personDetailsService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();

        UserDetails personDetails = personDetailsService.loadUserByUsername(login);

        String password = authentication.getCredentials().toString();

       if(!password.equals(personDetails.getPassword()))
           throw  new BadCredentialsException("Incorrect Password");

       //(данные о человеке, пароль, список прав)
       return new UsernamePasswordAuthenticationToken(personDetails, password, Collections.emptyList());
    }






    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
*/
