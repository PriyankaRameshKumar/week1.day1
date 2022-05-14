package week1.day1;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 1234567l;
	boolean isPunctured = true;
	String bikeName = "Bullet";
	double runningKm = 2345;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	TwoWheeler mybike = new TwoWheeler();
	System.out.println("Number of wheels = " + mybike.noOfWheels);
	System.out.println("Number of Mirrors = " + mybike.noOfMirrors);
	System.out.println("Chassis Number = " + mybike.chassisNumber);
	System.out.println("Bike name = " + mybike.bikeName);
	System.out.println("Running Kms = " + mybike.runningKm);
	System.out.println("The bike is punctured " + mybike.isPunctured);
		
	}

}
