import java.util.Date;
public class Task {
	
	
	
	
	
	
	private String name;
	private String description;
	private Date data;
	public Task(String nazvanie,String descr,Date data,String name, String surname, int telefon){
		this.name=nazvanie;
		this.description=descr;
		this.data=data;
		Contact contact=new Contact();
		contact.setname(name);
		contact.setsurname(surname);
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname(){
		return name;
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
	
	
	public static void main(String args[]){
	Task[] task=new Task[10];
	/*task[0]=new Task("nazvanie","descr","data","name", "surname", telefon);*/
	
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