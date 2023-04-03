package Inc1;

public class interface1 {
public static void main(String[] args) {
	Abdur abu=new Abdur();
	abu.show();

}
}
interface Roles1{
	
	public void leader();
	public void teacher();
	public void senior();
	
}
interface Roles2{
	public void son();
	public void father();
	public void project_trainer();
}

abstract class Human{
	public abstract void action();
	public void run() {
		System.out.println("wakeup early & go to jogging");
	}
}
 class Abdur extends Human implements Roles1{
	 public void show() {
		 action();
		 leader();
		 teacher();
		 senior();
	 }
	@Override
	public void action() {
	System.out.println("hai .this is abdur");		
	}
	@Override
	public void leader() {
		System.out.println("im a leader");
		
	}
	@Override
	public void teacher() {
		System.out.println("im a teacher");
		
	}
	@Override
	public void senior() {
		System.out.println("im a senior");
		
	}
	
	
}
class Jameel extends Human implements Roles2{
	public void showme() {
		action();
		son();
		father();
		project_trainer();
	}
	@Override
	public void action() {
		System.out.println("hai .this is jameel");
	}
	@Override
	public void son() {
		System.out.println("im a son");
		
	}
	@Override
	public void father() {
		System.out.println("im a father");
		
	}
	@Override
	public void project_trainer() {
		System.out.println("im a project_trainer");
		
	}
	
	
}