package com.detector.model;

public class SystemMetrics {

    private int processCount;
    private long freeMemory;
    private long totalMemory;

    public SystemMetrics(int processCount,long freeMemory ,long totalMemory){
        this.processCount=processCount;
        this.freeMemory=freeMemory;
        this.totalMemory=totalMemory;


    }
    public int getProcessCount(){
        return processCount;

    }

    public long getFreeMemory(){
        return freeMemory;
    }

    public long getTotalMemory(){
        return totalMemory;
    }
}
