
package models;
import java.util.*;

public class Result {

    
    public List<String> ganttChart = new ArrayList<>();
    public List<Process> processes = new ArrayList<>();

 
    public double avgWT;   
    public double avgTAT; 
    public double avgRT; 


    public Result(List<String> ganttChart, List<Process> processes,
                  double avgWT, double avgTAT, double avgRT) {
        this.ganttChart = ganttChart;
        this.processes = processes;
        this.avgWT = avgWT;
        this.avgTAT = avgTAT;
        this.avgRT = avgRT;
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
    
}
