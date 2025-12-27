package com.detector.model;
import java.time.LocalDateTime;

public class ThreatAlert{
        private String type;
        private String description;
        private int severity;
        private LocalDateTime detectedAt;

        public ThreatAlert(String type,String description,int severity){
                this.type=type;
                this.description=description;
                this.severity=severity;
                this.detectedAt=LocalDateTime.now();
        }
        public String getType(){
            return type;
        }
        public String getDescription(){
            return description;
        }
        public int getSeverity(){
            return severity;
        }
        public LocalDateTime getDetectedAt(){
            return detectedAt;
        }

}
