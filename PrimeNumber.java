package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 13;
		boolean flag = false;
		int i;
		
		for (i = 2 ;i <=value;i++) {
			
			if (value%2 == 0) {
				flag = true;
			}
		}
			if (flag == false) {
				System.out.println("The given number is prime");	
			}
			else {
				System.out.println("The given number is not prime");
				
			}
			
			
		
		
	}

}
