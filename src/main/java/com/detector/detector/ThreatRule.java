package com.detector.detector;

import com.detector.model.SystemMetrics;

public interface ThreatRule {
    boolean matches(SystemMetrics metrics);
    String getType();
    int getSeverity(SystemMetrics metrics);
    String getDescription();
}
