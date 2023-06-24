package com.example.diplom.services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')") //@PreAuthorize("hasRole('ROLE_ADMIN') or/and hasRole('ROLE_SOME_OTHER')")
    public void doHistoryStuff(){
        System.out.println("Do history stuff");
    }
}
