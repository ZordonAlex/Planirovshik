import java.util.*;
public class Task {
    private String name;
    private String description;
    Contact contact = new Contact();
    private Date date;
    public Task(){}
    public Task (String names,String descr,String name,String surname,Date date, String telefon){
        setName(names);
        setDescription(descr);
        contact.setName(name);
        contact.setSurname(surname);
        contact.setTelefon(telefon);
        setDate(date);

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
        return "Название задачи: "+ name + "\n" + "Описание задачи: " + description + "\n" + "Имя контакта: "+ contact.getName() + " Фамилия контакта: "+ contact.getSurname() + " Телефон контакта: "+ contact.getTelefon() + "\n" + "Время задачи: "+ date + "\n";
    }

}
