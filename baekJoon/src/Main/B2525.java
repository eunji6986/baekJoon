package Main;

import java.util.Scanner;

public class B2525 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h, m, n;

		h = sc.nextInt();
		m = sc.nextInt();
		n = sc.nextInt();
		
		m = m+n;
		 
		if( m >=60) { 
			h = h + (m/60); 
			m = m%60;
		}
		
		if(h == 24) {
			h = 0;
		}else if( h > 24){
			h= (h-24);
		}
		
		System.out.println(h + " " + m);

	}

}
