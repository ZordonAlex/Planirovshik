import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Methods {
    ArrayList<Task> Tasks = new ArrayList<Task>();
    MyTimer timer = new MyTimer();

    public void addTask() throws IOException, ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("¬ведите название задачи");
        String n = scan.nextLine();
        System.out.println("¬ведите описание задачи");
        String d = scan.nextLine();
        System.out.println("¬ведите им€ контакта");
        String name = scan.nextLine();
        System.out.println("¬ведите фамилию контакта");
        String surname = scan.nextLine();
        System.out.print("¬ведите дату задачи(в формате дд/мм/гггг/чч/мм): ");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy/hh/mm");
        Date date = format.parse(scan.nextLine());
        System.out.println("¬ведите телефон контакта");
        String p = scan.nextLine();

        System.out.println();
        Task task = new Task(n, d, name, surname, date,p );
        timer.toNotificate(date, task);
        Tasks.add(task);
    }
    public void showTask() {
        System.out.println("ѕоказываю список задач: ");
        System.out.println(Tasks);
    }

    public void removeTask() throws IOException {
        System.out.println("”дал€ю задачу по номеру.");
        System.out.print("¬ведите номер уд€л€емой задачи: ");
        BufferedReader delete = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(delete.readLine());
        Tasks.remove(index);
    }
}
