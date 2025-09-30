package Module03OOAD.designPatterns.BehavioralDP.CommandPattern.demo.src.main.java.com.example;

// Concrete Command 2
public class DontDoTask implements Command {
    private Task task;

    public DontDoTask(Task task) {
        this.task = task;
    }

    @Override
    public void doIt() {
        this.task.dontTask();
    }
}
