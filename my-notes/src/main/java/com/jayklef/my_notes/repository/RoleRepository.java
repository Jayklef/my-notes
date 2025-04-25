package com.jayklef.my_notes.repository;

import com.jayklef.my_notes.model.AppRole;
import com.jayklef.my_notes.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
