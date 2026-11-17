package com.gateora.api_management_service.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gateora.api_management_service.entity.ApiRoute;
import com.gateora.api_management_service.entity.OrganizationStatus;

import java.util.List;
import java.util.Optional;

public interface ApiRouteRepository extends JpaRepository<ApiRoute, Long> {

    List<ApiRoute> findAllByOrganizationId(Long organizationId);

    List<ApiRoute> findAllByActiveTrueAndOrganizationStatus(OrganizationStatus status);

    Optional<ApiRoute> findByIdAndOrganizationId(Long id, Long organizationId);

    boolean existsByOrganizationIdAndRouteId(Long organizationId, String routeId);
}
