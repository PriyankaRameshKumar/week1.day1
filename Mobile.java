package week1.day1;

public class Mobile {
		
	public void makeCall() {
		
		System.out.println("Method to make calls");
	}
	
	public void sendMsg() {
		System.out.println("Method to send message");
	}
	
	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
	}

}
