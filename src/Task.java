import java.util.*;
import java.io.*;
public class Task {
    private String name;
    private String description;
    Contact contact = new Contact();
    private Date date;
    public Task(){}
    public Task (String names,String descr,String name, Date date){
        setName(names);
        setDescription(descr);
        contact.setName(name);
        setDate(date);
        /*this.date = new GregorianCalendar(year, month - 1, day, hour,min );*/



    }
    public void setDate(Date date) {
        this.date=date;
    }
    public Date getDate() {
        return date;
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
        return "Название задачи: "+ name + "\n" + "Описание задачи: " + description + "\n" + "Имя контакта: "+ contact.getName() + "\n" + "Время задачи: "+ date;
    }
 /*public int check() {

     int i = 0;
     if(date.before(date_out)) {
         i = 1;
     }
     return i;
 }*/

   /* public static void main(String[] args) {
        ArrayList<Task> Tasks = new ArrayList<Task>();
        Task task=new Task("yytr","try","fdsfd",1994,4,5,23,23,23);// и тут ошибка

        Tasks.add(task);
        System.out.println(Tasks);

    }*/
}
