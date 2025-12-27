package com.detector.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.detector.detector.ProcessCountRule;
import com.detector.detector.ThreatRule;
import com.detector.model.SystemMetrics;
import com.detector.model.ThreatAlert;

@Service
public class ThreatDetectionService {

    private final List<ThreatRule> rules=List.of(new ProcessCountRule());

    public List <ThreatAlert>  detect(SystemMetrics metrics){
        List <ThreatAlert> alerts =new ArrayList<>();

        for(ThreatRule rule:rules){
            if(rule.matches(metrics)){
               alerts.add(new ThreatAlert(
                rule.getType(),
            rule.getDescription(),
            rule.getSeverity(metrics)
                            ));
            }
        }
        return alerts;
    }
}
