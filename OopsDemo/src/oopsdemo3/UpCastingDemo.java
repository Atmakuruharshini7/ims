//upcasting is used when you want to generalize a function or
//property so that it can be used by any of it’s subtype

package oopsdemo3;

class Game
{
        public void play(){
        System.out.println("Game is being played");
        }
        
        public void noOfPlayers(){
        System.out.println("No of players depend upon the game");
        }
        
        public void winner(String name){
        System.out.println("Winner is : " + name);
        }
}

class Cricket extends Game{
    
public void noOfPlayers(){
System.out.println("22");
}

public void teams(){
System.out.println("2");
}
}

 class Chess extends Game{
    
     public void noOfPlayers(){
     System.out.println("2");
     }
     }

public class UpCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Game g=new Cricket();
Game g1=new Chess();
g.play();//dynamic binding
g.noOfPlayers();
g.winner("A");

// g.teams ->compire error

Cricket c=new Cricket();//static binding
c.teams();

g1.play();
g1.noOfPlayers();
g1.winner("vish");
System.out.println("************");

Game g100;
g100=new Cricket();

g100.play();
g100.noOfPlayers();
g100.winner("csk");
System.out.println("****");
Test t1=new Test(100,200,300);

System.out.println("defaulth variable: "+t1.a);

Test2 t2=new Test2(100,200,300);
t2.print();
	}

}
