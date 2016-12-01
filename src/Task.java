import java.util.ArrayList;
import java.util.Date;
public class Task {
	private String nazvanie;
	private String description;
	private Date data; 
	Contact contact;
	public Task (String nazvanie,String descr,String name){
		this.nazvanie=nazvanie;
		this.description=descr;
		contact.setName(name);//пытаюсь записать имя контакта, но выводится ошибка Exception in thread "main" java.lang.NullPointerException
	}
	
	public void setNazvanie(String nazvanie)
	{
		this.nazvanie=nazvanie;
	}
	public String getNazvanie(){
		return nazvanie;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public String getDescription(){
		return description;
	}
	public void setData(Date data)
	{
		this.data=data;
	}
	public Date getData(){
		return data;
	}
	@Override
	public String toString(){
		return "Название задачи: "+ nazvanie + " Описание задачи: " + description + " Имя контакта: "+ contact.getName();
	}
	
	
	public static void main(String[] args) {
        ArrayList<Task> Tasks = new ArrayList<Task>();
		Task task=new Task("yytr","try","fdsfd");// и тут ошибка 
	    
		Tasks.add(task);
		System.out.println(Tasks);
}
}

