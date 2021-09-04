package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 5;
		int fact=1;
		int i;
		
		for (i = 1;i<=input;i++) {
			fact = fact*i;
			//fact = number;
			//System.out.println(fact);
			System.out.println(i);
		}
		
		System.out.println("The factorial is "+ fact);
	}

}
