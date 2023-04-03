package Inc1;

public class GuessGame {
public static void main(String[] args) {

GussGame gg=new GussGame();
gg.startGame();
}
}
class Player{
	int number=0;
	public void guess() {
		number=(int)(Math.random()*10);
		System.out.println("im gussing number is"+number);
	}
}
class GussGame{
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		p1=new Player();
		p2=new Player();
		p3=new Player();
		
		int guessp1=0;
		int guessp2=0;
		int guessp3=0;
		
		boolean p1right=false;
		boolean p2right=false;
		boolean p3right=false;
		
		int target=(int)(Math.random()*10);
		System.out.println("number between 0-9");
		while(true) {
			System.out.println("Number is"+target);
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1=p1.number;
			System.out.println("player one "+guessp1);
			guessp2=p2.number;
			System.out.println("player two "+guessp2);
			guessp3=p3.number;
			System.out.println("player three "+guessp3);
			
			if(guessp1==target)
				p1right=true;
			if(guessp2==target)
				p2right=true;
			if(guessp3==target)
				p3right=true;
		if(p1right || p2right|| p3right) {
         System.out.println("p1 is right?"+p1right);
         System.out.println("p2 is right?"+p2right);
         System.out.println("p3 is right?"+p3right);
         System.out.println("game over");
         break;
			}else {
				System.out.println("try again");
			}
		}
		
	}
}
