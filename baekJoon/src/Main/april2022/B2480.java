package Main.april2022;

import java.util.Scanner;

public class B2480 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	
	//셋 다 다를경우
	if ( a > b && a > c && b != c  ) {
		System.out.println( a * 100 );
	}else if( b > a && b > c && a != c  ) {
		System.out.println( b * 100 );
	}else if( c > b && c > a && b != a  ) {
		System.out.println( c * 100 );
	}		
	
	// 두개가 같을 경우 	
	if( a == b && a !=c) {
		System.out.println(1000 + (a*100));	
	}else if (b==c && c!=a) {
		System.out.println(1000 + (b*100));	
	}else if (c==a && c!=b){
		System.out.println(1000 + (c*100));	
	}
	
	//셋 다 같을 경우 
	if( a==b && b==c) {
		System.out.println(10000 + (a*1000));
	}
	
	
	
	
	
	
	
	
	
}

}
