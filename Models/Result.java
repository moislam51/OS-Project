
package model;

import java.util.List;

public class Result {

    // Gantt Chart representation (sequence of process IDs or names)
    private List<String> ganttChart;

    // Final state of processes after scheduling
    private List<Process> processes;

    // Averages
    private double avgWT;   // Average Waiting Time
    private double avgTAT;  // Average Turnaround Time
    private double avgRT;   // Average Response Time

    // Constructor
    public Result(List<String> ganttChart, List<Process> processes,
                  double avgWT, double avgTAT, double avgRT) {
        this.ganttChart = ganttChart;
        this.processes = processes;
        this.avgWT = avgWT;
        this.avgTAT = avgTAT;
        this.avgRT = avgRT;
    }

    // Empty constructor (important for flexibility)
    public Result() {}

    // Getters & Setters

    public List<String> getGanttChart() {
        return ganttChart;
    }

    public void setGanttChart(List<String> ganttChart) {
        this.ganttChart = ganttChart;
    }

    public List<Process> getProcesses() {
        return processes;
    }

    public void setProcesses(List<Process> processes) {
        this.processes = processes;
    }

    public double getAvgWT() {
        return avgWT;
    }

    public void setAvgWT(double avgWT) {
        this.avgWT = avgWT;
    }

    public double getAvgTAT() {
        return avgTAT;
    }

    public void setAvgTAT(double avgTAT) {
        this.avgTAT = avgTAT;
    }

    public double getAvgRT() {
        return avgRT;
    }

    public void setAvgRT(double avgRT) {
        this.avgRT = avgRT;
    }
}
