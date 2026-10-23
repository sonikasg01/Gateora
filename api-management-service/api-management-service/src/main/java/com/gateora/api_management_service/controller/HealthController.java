package com.gateora.api_management_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gateora.api_management_service.dto.response.HealthResponse;
import com.gateora.api_management_service.service.HealthService;

import java.time.LocalDateTime;


@RestController 
@RequestMapping ("/health")
public class HealthController {
    public HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService; 
       
    }
    @GetMapping 
    public ResponseEntity<HealthResponse> health() {
        // This method can be used to check the health of the service
        String dbStatus = healthService.getHealth();    
        return ResponseEntity.ok(
            new HealthResponse("UP", dbStatus, LocalDateTime.now()));
    }
}
