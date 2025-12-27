package com.detector.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.detector.model.SystemMetrics;
import com.detector.model.ThreatAlert;
import com.detector.service.SystemMetricsService;
import com.detector.service.ThreatDetectionService;

@RestController
public class ThreatController{

     private final SystemMetricsService metricsService;
    private final ThreatDetectionService detectionService;

    public ThreatController(SystemMetricsService metricsService,
                            ThreatDetectionService detectionService) {
        this.metricsService = metricsService;
        this.detectionService = detectionService;
    }

   @GetMapping("/threats")
public List<ThreatAlert> detectThreats(
        @RequestParam(required = false) Integer minSeverity) {

    SystemMetrics metrics = metricsService.collectMetrics();
    List<ThreatAlert> alerts = detectionService.detect(metrics);

    if (minSeverity != null) {
        return alerts.stream()
                .filter(a -> a.getSeverity() >= minSeverity)
                .toList();
    }

    return alerts;
}

}

