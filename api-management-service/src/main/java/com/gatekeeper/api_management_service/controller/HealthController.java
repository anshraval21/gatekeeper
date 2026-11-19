package com.gatekeeper.api_management_service.controller;

import com.gatekeeper.api_management_service.dto.HealthResponseDto;
import com.gatekeeper.api_management_service.service.HealthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/health")
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping
    public ResponseEntity<HealthResponseDto> health() {
        String dbStatus = healthService.getHealth();
        return ResponseEntity.ok(new HealthResponseDto("UP", dbStatus, LocalDateTime.now()));
    }
}
