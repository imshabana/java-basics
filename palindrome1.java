package JavaBasics;

public class palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="mom";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
		char	c1=input.charAt(i);
		output=output+c1;
		}
			System.out.println(output);
			if(input.equals(output))
			{
				System.out.println("this is  palindrome");
			}
			
			else
			{
				System.out.println("not palindrome");
			}
			
		

	}
}
