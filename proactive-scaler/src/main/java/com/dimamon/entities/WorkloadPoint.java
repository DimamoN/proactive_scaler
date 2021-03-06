package com.dimamon.entities;

import org.influxdb.annotation.Column;
import org.influxdb.annotation.Measurement;

import java.time.Instant;

@Measurement(name = "workload")
public class WorkloadPoint {

    @Column(name = "time")
    private Instant time;

    @Column(name = "cpu")
    private Double cpu;

    @Column(name = "process_cpu")
    private Double processCpu;

    /**
     * Workload in human readable form from 0 to ~100
     */
    @Column(name = "pod_cpu")
    private Double podCpu;

    @Column(name = "instanceName")
    private String instanceName;

    // not used

    @Column(name = "free_ram")
    private Integer freeRam;

    @Column(name = "total_ram")
    private Integer totalRam;

    public WorkloadPoint() {
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public Double getCpu() {
        return cpu;
    }

    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    public Double getProcessCpu() {
        return processCpu;
    }

    public void setProcessCpu(Double processCpu) {
        this.processCpu = processCpu;
    }

    public Double getPodCpu() {
        return podCpu;
    }

    public void setPodCpu(Double podCpu) {
        this.podCpu = podCpu;
    }

    public Integer getFreeRam() {
        return freeRam;
    }

    public void setFreeRam(Integer freeRam) {
        this.freeRam = freeRam;
    }

    public Integer getTotalRam() {
        return totalRam;
    }

    public void setTotalRam(Integer totalRam) {
        this.totalRam = totalRam;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    @Override
    public String toString() {
        return "WorkloadPoint{" +
                "time=" + time +
                ", cpu=" + cpu +
                ", processCpu=" + processCpu +
                ", podCpu=" + podCpu +
                ", freeRam=" + freeRam +
                ", totalRam=" + totalRam +
                ", instanceName='" + instanceName + '\'' +
                '}';
    }
}
