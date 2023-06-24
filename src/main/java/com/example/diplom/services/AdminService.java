package com.example.diplom.services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @PreAuthorize("hasRole('ROLE_ADMIN')") //@PreAuthorize("hasRole('ROLE_ADMIN') or/and hasRole('ROLE_SOME_OTHER')")
    public void doAdminStuff(){
        System.out.println("Do admin here");
    }
}
