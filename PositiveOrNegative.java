package week1.day1;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 0;
		if (number>=1) {
			System.out.println("The given number is positive");
		} 
		else if (number<1 && number !=0) {
			System.out.println("The given number is negative");
		}
		else {
			System.out.println("The given number is neither negative nor positive");
		}
	}

}
