import java.util.ArrayList;
import java.util.Date;
public class Task {
	private String nazvanie;
	private String description;
	private Date data;
	public Task (String nazvanie,String descr,String name, String surname){
		this.nazvanie=nazvanie;
		this.description=descr;
		/*this.data=data;*/
		Contact contact=new Contact();
		contact.setname(name);
		contact.setsurname(surname);
	}
	public void setname(String nazvanie)
	{
		this.nazvanie=nazvanie;
	}
	public String getname(){
		return nazvanie;
	}
	public void setdescription(String description)
	{
		this.description=description;
	}
	public String getdescription(){
		return description;
	}
	public void setdata(Date data)
	{
		this.data=data;
	}
	public Date getdata(){
		return data;
	}
	@Override
	public String toString(){
		return "Название задачи: "+ nazvanie + " Описание задачи: " + description + " Имя контакта: "/*+ contact.getname()*/;
	}
	
	
	public static void main(String[] args) {
        ArrayList<Task> Tasks = new ArrayList<Task>();
		Task task=new Task("yytr","try","eryt","eytter");
	    
		Tasks.add(task);
		System.out.println(Tasks);
}
}
class Contact{
	private String name;
	private String surname;
	private int telefon;
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public void setsurname(String surname)
	{
		this.surname=surname;
	}
	public String getsurname(){
		return surname;
	}
	public void settelefon(int telefon)
	{
		this.telefon=telefon;
	}
	public int gettelefon(){
		return telefon;
	}
}

