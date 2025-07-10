package JavaBasics;

import java.util.Scanner;

public class Scannerclass {
	
	 double pi=3.14;
	 static int r ;
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 =new Scanner(System.in);
		
		
		double r =s1.nextDouble();
		
double  area =3.14*r*r;
System.out.println("area of circle is : area" + area);

double circumference = 2*3.14*r;
		
System.out.println("area of circle is : circumference" + circumference);
		
		
		

	}

}
