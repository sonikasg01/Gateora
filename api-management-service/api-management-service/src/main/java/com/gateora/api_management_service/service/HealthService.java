package com.gateora.api_management_service.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class HealthService {
    private final JdbcTemplate jdbcTemplate;

    public String getHealth() {
        // This method can be used to check the health of the service
       String dbStatus="Down";
       try{
        Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
        if(Integer.valueOf(1).equals(result)){
            dbStatus="Up";
        }
       }
       catch(Exception e){
            System.out.println("MYSQL health check failed: " + e.getMessage());
       }
        return dbStatus;
    }
}
