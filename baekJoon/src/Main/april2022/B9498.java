package Main.april2022;

import java.util.Scanner;

public class B9498 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int score = sc.nextInt();
		String grade;
		
		if (score >=90) {
			grade = "A";
		}else if (score >=80 && score < 90) {
			grade = "B";
		}else if (score >=70 && score < 80) {
			grade = "C";
		}else if (score >=60 && score < 70) {
			grade = "D";
		}else { grade = "F"; }
		
		System.out.println(grade);
		
	}

}
