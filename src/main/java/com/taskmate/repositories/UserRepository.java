package com.taskmate.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.taskmate.entities.User;
import com.taskmate.enums.UserRole;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findFirstByEmail(String username);

	Optional<User> findByUserRole(UserRole userRole);

}
