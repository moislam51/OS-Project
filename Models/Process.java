public class Process {
    public String id;
    public int arrivalTime;
    public int burstTime;
    public int priority;
    
    
    public int remainingTime;
    public int startTime = -1;
    public int completionTime;
    
    public int waitingTime = 0;
    public int turnaroundTime = 0;
    public int responseTime = 0;

    public Process(String id, int at, int bt, int pr) {
        this.id = id;
        this.arrivalTime = at;
        this.burstTime = bt;
        this.priority = pr;
        this.remainingTime = bt;
        System.out.println("object created");
    }
}
