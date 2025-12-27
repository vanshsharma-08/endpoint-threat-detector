package com.detector.detector;

import com.detector.model.SystemMetrics;

public class ProcessCountRule implements ThreatRule {

    @Override
    public boolean matches(SystemMetrics metrics) {
        return metrics.getProcessCount() > 250;
    }

    @Override
    public String getType() {
        return "PROCESS_ANOMALY";
    }

    @Override
    public int getSeverity(SystemMetrics metrics) {
        int count = metrics.getProcessCount();
        if (count > 400) return 9;
        if (count > 300) return 7;
        return 5;
    }

    @Override
    public String getDescription() {
        return "High number of running processes";
    }
}
