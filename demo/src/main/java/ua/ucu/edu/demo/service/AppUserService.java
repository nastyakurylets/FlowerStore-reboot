package ua.ucu.edu.demo.service;

import org.springframework.stereotype.Service;

import ua.ucu.edu.demo.model.AppUser;
import ua.ucu.edu.demo.repository.AppUserRepository;

import java.util.List;

@Service
public class AppUserService {
    
    private AppUserRepository appUserRepository;

    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getAppUsers() {
        return appUserRepository.findAll();
    }

    public AppUser createAppUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    public AppUser getUserByEmail(String email) {
        return appUserRepository.findUserByEmail(email);
    }
}