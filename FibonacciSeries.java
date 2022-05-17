package week1.day1.assignements;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range = 8;
		int firstnum = 0;
		int secondnum = 1;
		int sum;
		
		System.out.println(firstnum);
		System.out.println(secondnum);

		for (int i = 1 ; i <= range ; i++)
		{
			sum = firstnum+secondnum;
			System.out.println(sum);
			firstnum = secondnum;
			secondnum = sum;

		}

	}

}
