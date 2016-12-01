import java.util.ArrayList;
import java.util.Date;
public class Task {
	private String nazvanie;
	private String description;
	private Date data; 
	Contact contact;
	public Task (String nazvanie,String descr){
		this.nazvanie=nazvanie;
		this.description=descr;
		
		
	}
	public void setName(String nazvanie)
	{
		this.nazvanie=nazvanie;
	}
	public String getName(){
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
		return "Название задачи: "+ nazvanie + " Описание задачи: " + description + " Имя контакта: "/*+ contact.getname()*/;
	}
	
	
	public static void main(String[] args) {
        ArrayList<Task> Tasks = new ArrayList<Task>();
		Task task=new Task("yytr","try");
	    
		Tasks.add(task);
		System.out.println(Tasks);
}
}

