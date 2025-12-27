package com.detector.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.detector.model.SystemMetrics;
import com.detector.service.SystemMetricsService;

@RestController
public class MetricsController {

    private final SystemMetricsService metricsService;

    public MetricsController(SystemMetricsService metricsService) {
        this.metricsService = metricsService;
    }

    @GetMapping("/metrics")
    public SystemMetrics getMetrics() {
        return metricsService.collectMetrics();
    }
}
