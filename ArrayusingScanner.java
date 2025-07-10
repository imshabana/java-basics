package JavaBasics;
import java.lang.reflect.Array;
import java.util.*;

import java.util.Scanner;

public class ArrayusingScanner {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		int[] rollnum=new int[3];
		rollnum[0]=s1.nextInt();
		
		rollnum[1]=s1.nextInt();
		
		rollnum[2]=s1.nextInt();
		

		System.out.println(Arrays.toString(rollnum));

	}

}
