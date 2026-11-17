package com.gateora.api_management_service.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gateora.api_management_service.entity.Organization;
import com.gateora.api_management_service.entity.OrganizationStatus;

import java.util.List;
import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    boolean existsByNameIgnoreCase(String name);

    boolean existsBySlugIgnoreCase(String slug);

    List<Organization> findAllByStatusNot(OrganizationStatus status);

    Optional<Organization> findByIdAndStatusNot(Long id, OrganizationStatus status);
}
