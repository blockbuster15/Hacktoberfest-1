package lec1;

import java.util.Scanner;

public class anybasetodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n =new Scanner(System.in).nextInt();
         int b=new Scanner(System.in).nextInt();
         int ans=0;
         int m=1;
         while(n!=0) {
        	 int r=n%10;
        	 ans=ans+r*m;
        	 n=n/10;
        	 m=m*b;
         }
         System.out.println(ans);
         
	}

}
