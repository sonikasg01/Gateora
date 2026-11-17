package com.gateora.api_management_service.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gateora.api_management_service.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
}