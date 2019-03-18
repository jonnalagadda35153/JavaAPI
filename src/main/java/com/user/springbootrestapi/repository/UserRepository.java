package com.user.springbootrestapi.repository;

import com.user.springbootrestapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
