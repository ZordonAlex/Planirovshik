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
        System.out.println("������� �������� ������");
        String n = scan.nextLine();
        System.out.println("������� �������� ������");
        String d = scan.nextLine();
        System.out.println("������� ��� ��������");
        String name = scan.nextLine();
        System.out.println("������� ������� ��������");
        String surname = scan.nextLine();
        System.out.print("������� ���� ������(� ������� ��/��/����/��/��): ");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy/hh/mm");
        Date date = format.parse(scan.nextLine());
        System.out.println("������� ������� ��������");
        String p = scan.nextLine();

        System.out.println();
        Task task = new Task(n, d, name, surname, date,p );
        timer.toNotificate(date, task);
        Tasks.add(task);
    }
    public void showTask() {
        System.out.println("��������� ������ �����: ");
        System.out.println(Tasks);
    }

    public void removeTask() throws IOException {
        System.out.println("������ ������ �� ������.");
        System.out.print("������� ����� ��������� ������: ");
        BufferedReader delete = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(delete.readLine());
        Tasks.remove(index);
    }
}
