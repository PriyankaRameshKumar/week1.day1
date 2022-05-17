package week1.day1.assignements;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 7;
		boolean flag = false;

		for( int i = 2 ; i < input ; i++)
		{
			if(input%i == 0)
			{
				System.out.println("Not a prime number");
				flag = true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}
