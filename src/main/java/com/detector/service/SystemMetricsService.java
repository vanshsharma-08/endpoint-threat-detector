package com.detector.service;

import org.springframework.stereotype.Service;

import com.detector.model.SystemMetrics;

@Service
public class SystemMetricsService {

    public SystemMetrics collectMetrics() {
        int processCount = (int) ProcessHandle.allProcesses().count();
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory();
        long totalMemory = runtime.totalMemory();

        return new SystemMetrics(processCount, freeMemory, totalMemory);
    }
}
