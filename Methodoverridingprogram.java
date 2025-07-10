package JavaBasics;
class Shabana
{ 
	void add(int a,int b) {
		
	
	System.out.println("sum of num"+(a+b));
	
	}
}
class Arfan extends Shabana
{
	void add(int a,int b) {
		System.out.println("sum of num"+(a+b+1));
	}
	
}	
public class Methodoverridingprogram {
public static void main(String[] args) {
		// TODO Auto-generated method
		Arfan obj =new Arfan();
		obj.add(1,2);
		
		
		
		
	

	}
}
