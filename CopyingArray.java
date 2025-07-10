package JavaBasics;

import java.util.Arrays;

public class CopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] rollnumA=new int[4];
		rollnumA[0]=30;
		rollnumA[1]=20;
		rollnumA[2]=30;
		rollnumA[3]=40;
		
		
		int[] rollnumB=new int[4];
		
		for(int i=0;i<rollnumA.length;i++)
{
		    rollnumB[i]= rollnumA[i];
}
		System.out.println(Arrays.toString(rollnumA));
		
	
	System.out.println( Arrays.toString(rollnumB));

}
}