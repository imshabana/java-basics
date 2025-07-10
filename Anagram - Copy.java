package JavaBasics;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A = "tea";
		String B = "eat";
		if(A.length()!=B.length())
		{
			System.out.println("this is not Anagram");
		}
		else
			{
			char c1[]= A.toCharArray();
          char c2[]=B.toCharArray();
          
          Arrays.sort(c1);
          Arrays.sort(c2);
          System.out.println(Arrays.toString(c1));
          
          System.out.println(Arrays.toString(c2));
          
        if(Arrays.equals(c1, c2)==true)

        {
        	System.out.println("this is anagram");
        }
       
        else 
        {
        	System.out.println("this is  not anagram");
        }
	}

}}