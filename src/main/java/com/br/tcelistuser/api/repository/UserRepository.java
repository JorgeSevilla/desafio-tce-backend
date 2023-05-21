package com.br.tcelistuser.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.br.tcelistuser.api.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    @Query("SELECT u FROM User u WHERE LOWER(u.username) LIKE %:query% OR LOWER(u.name) LIKE %:query% OR LOWER(u.email) LIKE %:query%")
    List<User> searchByQueryIgnoreCase(@Param("query") String query);

    //Alternative method for use with Spring 
    //List<User> findByUsernameOrNameOrEmail(String username, String name, String email);
}
