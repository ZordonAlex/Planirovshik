import java.util.TimerTask;
import java.util.Date;
import java.util.Timer;

public class MyTimer extends TimerTask {
    Task task=new Task();
    Timer timer = new Timer();

    public MyTimer() {
    }

    private MyTimer(Task task) {
        this.task = task;
    }

    public void run(){
        System.out.println("\nНаступившие задачи: " + task.getName());
    }

    public void toNotificate(Date date, Task task){
        timer.schedule(new MyTimer(task), date);
    }
}

