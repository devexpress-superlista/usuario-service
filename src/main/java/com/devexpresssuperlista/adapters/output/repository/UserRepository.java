package com.devexpresssuperlista.adapters.output.repository;

import com.devexpresssuperlista.applications.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
