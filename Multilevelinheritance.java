package JavaBasics;

public class Multilevelinheritance  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=5;
		int c=a+b;
		System.out.println(c);
		
		
	 class singlelevelinheritance extends Multilevelinheritance {

			public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				System.out.println();
				
				
		class Multiinheritance  extends Multilevelinheritance
		{
			
			public static void main(String[] args)
			{
				System.out.println();
			}
			
			
			
			
			
		}
			
	}

}
}
	}