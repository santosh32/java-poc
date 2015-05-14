package com.santosh.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosh.poc.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
}
