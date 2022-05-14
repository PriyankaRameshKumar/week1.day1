package week1.day1;

public class Car {
	
	public void applyBrake()
	{
		System.out.println("Method to apply brake");
	}
	
	public void applyGear()
	{
		System.out.println(" Method to apply Gear");
	}
	
	public void switchOnAc()
	{
		System.out.println(" Method to switch on AC");
	}
	
	public void applyAcclerate()
	{
		System.out.println("Method to apply Acclerate");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car sedanCar = new Car();
		sedanCar.applyBrake();
		sedanCar.applyGear();
		sedanCar.switchOnAc();
		sedanCar.applyAcclerate();

	}

}
