package week1.day1;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = -40;
		if (number < 0) {
			number = number*(-1);
			System.out.println("The number -40 is converted to 40");
		}
		else {
			System.out.println("The given number is positive and need not be converted");
		}
			}

}
