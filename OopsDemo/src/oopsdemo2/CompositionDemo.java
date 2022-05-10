package oopsdemo2;
class Honda extends Car
{
	public void hondaStart() {
		Engine heng=new Engine();
		heng.startEngine();
	}
}
class Hyundai extends Car
{
	public void HyundaiStart() {
		Engine heng=new Engine();
		heng.startEngine();
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Honda hondaCity=new Honda();
hondaCity.setColor("Silver");
hondaCity.setMax_speed(180);   

System.out.println("*******Honda Car Details *********");
System.out.println(hondaCity.getColor() +" Color");
System.out.println(hondaCity.getMax_speed()+" Speed");

hondaCity.hondaStart();
	}

}
