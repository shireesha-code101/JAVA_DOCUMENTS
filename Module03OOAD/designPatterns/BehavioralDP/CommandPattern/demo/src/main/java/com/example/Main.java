package Module03OOAD.designPatterns.BehavioralDP.CommandPattern.demo.src.main.java.com.example;

// Client
public class Main {
    public static void main(String[] args) {
        System.out.println("Command Pattern - Behavioural DP");

        Task task = new Task();
        Mom remote = new Mom();

        Command onCommand = new DoTask(task);
        Command offCommand = new DontDoTask(task);

        remote.setCommand(onCommand);   // Mom says: "Do the task"
        remote.executeCommand();        // Executes doTask()

        remote.setCommand(offCommand);  // Mom says: "Don't do the task"
        remote.executeCommand();        // Executes dontTask()
    }
}
