package com.community.rest.repository;

import com.community.rest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReopository extends JpaRepository<User, Long> {}