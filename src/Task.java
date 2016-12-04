import java.util.ArrayList;
import java.util.GregorianCalendar;

import java.util.Scanner;
public class Task {
    private String name;
    private String description;
    Contact contact = new Contact();
    private GregorianCalendar date;
    private boolean key = false;
    GregorianCalendar date_out = new GregorianCalendar( );

    public Task (String names,String descr,String name, int year, int month , int day, int hour , int min){
        setName(names);
        setDescription(descr);
        contact.setName(name);
        this.date = new GregorianCalendar(year, month - 1, day, hour,min );



    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setDescription(String description)
    {
        this.description=description;
    }
    public String getDescription(){
        return description;
    }


    @Override
    public String toString(){
        return "�������� ������: "+ name + " �������� ������: " + description + " ��� ��������: "+ contact.getName() + " ����� ������: "+ date.getTime() + " " + date_out.getTime();
    }
 public int check() {

     int i = 0;
     if(date.before(date_out)) {
         i = 1;
     }
     return i;
 }

 public static void main(String[] args) {
     ArrayList<Task> Tasks = new ArrayList<Task>();
     Scanner scan = new Scanner(System.in);
     System.out.println("������� �������� ������");
     String n = scan.nextLine();
     System.out.println("������� �������� ������");
     String d = scan.nextLine();
     System.out.println("������� ��� ��������");
     String name = scan.nextLine();
     System.out.println("������� ��� ����������� ������");
     int y = scan.nextInt();
     System.out.println("������� ����� ����������� ������");
     int m = scan.nextInt();
     System.out.println("������� ���� ����������� ������");
     int day = scan.nextInt();
     System.out.println("������� ��� ����������� ������");
     int hours = scan.nextInt();
     System.out.println("������� ������ ����������� ������");
     int min = scan.nextInt();


     Task task=new Task(n,d,name,y,m,day,hours,min);
     Tasks.add(task);
     System.out.println(Tasks);

     for (;;) {
         int a = task.check();
         if (a == 1){
         System.out.println("����� ������ " + task.getName() + " ���������");
         break;
         }
     }
 }
}

