package Main;

import java.util.Scanner;

public class B2753 {
	public static void main(String[] args) {
		
	//윤년
	
	Scanner scan = new Scanner(System.in);
	
	int year = scan.nextInt();
	 
	year = ((year%4 == 0 && year%100 != 0) || year%400 == 0) ? 
	1 : 0;
	
	System.out.println(year);
	

	}
}
