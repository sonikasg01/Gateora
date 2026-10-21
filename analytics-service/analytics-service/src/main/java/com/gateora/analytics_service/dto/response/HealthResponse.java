package com.gateora.analytics_service.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor 
@Getter 
@Setter
public class HealthResponse {
private String serviceName;
 private String serviceDescription; 
 private String appStatus;
}
