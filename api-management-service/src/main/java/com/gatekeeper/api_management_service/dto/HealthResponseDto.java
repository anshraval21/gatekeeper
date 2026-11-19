package com.gatekeeper.api_management_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class HealthResponseDto {
    private String serviceStatus;
    private String dbStatus;
    private LocalDateTime timestamp;

}
