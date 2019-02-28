package Inhari;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ch=new Child(420, "Deeksha");
System.out.println("[Id Is :"+ch.id+", Name Is:"+ch.name+"]");
Jay JD=new Jay("");
System.out.println("[ Adress Of The Object "+JD+"]");
System.out.println("*********************************************");
Beta bt=new Beta(215, "Janmejaya");
System.out.println(" [ Studentt Id "+bt.id+"]");
System.out.println("[ Student Name "+bt.name+"]");
	}

}
class Jay{
	
	Jay(String name){
		System.out.println(name="Deeksha Jay ");
		
	}
	
}
