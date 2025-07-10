package JavaBasics;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
	int	num=sc.nextInt();
		
		//StringBuilder sb1=new StringBuilder();
		
		//sb1.append(num);
		
	//StringBuffer rev = sb1.reverse();
	
	//System.out.println("the reverse num is: "+ rev);
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
StringBuffer		rev=sb.reverse();

System.out.println("rev num is: "+ rev);

	}

}
