package com.gateora.api_management_service.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gateora.api_management_service.entity.RouteConfigurationVersion;

import java.util.List;

public interface RouteConfigurationVersionRepository extends JpaRepository<RouteConfigurationVersion, Long> {

    List<RouteConfigurationVersion> findAllByOrganizationIdAndRouteIdOrderByVersionNumberDesc(Long organizationId,
                                                                                              String routeId);

}