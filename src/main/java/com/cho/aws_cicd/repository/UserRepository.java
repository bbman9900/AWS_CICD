package com.cho.aws_cicd.repository;

import com.cho.aws_cicd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
