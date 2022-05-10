package oopsdemo3;

public class Maruthi implements INewCarMode {
Car car=new Car("maruthi",true, "brezza",5.1f,"white","Petrol","200bhp",6);
	
	
	public void CarFeatures()
    {
        System.out.println("Brand Name : "+ car.getCompany());
        System.out.println("Color of Car : "+ car.getColor());
        System.out.println("Power : "+ car.getPower());
        System.out.println("Fuel type : "+ car.getFuelType());
        System.out.println("No of Gears: " + car.getNumberOfGear());
    }
	
	
	@Override
	public void isAutomatic() {
		// TODO Auto-generated method stub
System.out.println("is this car automatic "+car.isAutomatic);
	}

	@Override
	public void modelName() {
		// TODO Auto-generated method stub
System.out.println("model name "+car.modelName);
	}

	@Override
	public void highTechAC() {
		// TODO Auto-generated method stub
System.out.println("Ac spec "+car.getHighTechAC());
	}

}
