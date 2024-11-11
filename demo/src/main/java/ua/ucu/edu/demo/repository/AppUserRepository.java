package ua.ucu.edu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ua.ucu.edu.demo.model.AppUser;


@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    
    @Query("SELECT u FROM app_user u WHERE u.email = ?1")
    AppUser findUserByEmail(String email);
}