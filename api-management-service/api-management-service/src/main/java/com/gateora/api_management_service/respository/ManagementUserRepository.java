package com.gateora.api_management_service.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gateora.api_management_service.entity.ManagementUser;

import java.util.Optional;

public interface ManagementUserRepository extends JpaRepository<ManagementUser, Long> {

    Optional<ManagementUser> findByUsername(String username);

    Optional<ManagementUser> findByOrganizationId(Long organizationId);

    boolean existsByUsername(String username);

}