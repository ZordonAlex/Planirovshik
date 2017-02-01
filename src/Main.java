
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException, ParseException {
        ArrayList<Task> Tasks = new ArrayList<Task>();
        MyTimer timer = new MyTimer();
        Scanner scan = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¬ведите название задачи");
        String n = scan.nextLine();
        System.out.println("¬ведите описание задачи");
        String d = scan.nextLine();
        System.out.println("¬ведите им€ контакта");
        String name = scan.nextLine();
        System.out.print("¬ведите дату задачи(в формате дд/мм/гггг): ");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy/hh/mm");
        Date date = format.parse(scan.nextLine());

        System.out.println();


        Task task=new Task(n,d,name,date);
        timer.toNotificate(date, task);
        Tasks.add(task);
        System.out.println(Tasks);

        /*for (;;) {
            int a = task.check();
            if (a == 1){
            System.out.println("¬рем€ задачи " + task.getName()+ " наступило");
            break;
            }
        }*/
    }
}
