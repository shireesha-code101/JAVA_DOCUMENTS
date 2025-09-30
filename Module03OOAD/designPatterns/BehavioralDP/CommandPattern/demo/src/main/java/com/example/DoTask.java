package Module03OOAD.designPatterns.BehavioralDP.CommandPattern.demo.src.main.java.com.example;

// Concrete Command 1
public class DoTask implements Command {
    private Task task;

    public DoTask(Task task) { // constructor (no return type)
        this.task = task;
    }

    @Override
    public void doIt() {
        this.task.doTask();
    }
}
