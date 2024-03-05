package com.CK.repository;

import com.CK.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRepository extends JpaRepository<Auth, Long> {
    boolean existsByUsername(String username);

    boolean existsByPassword(String password);
}
