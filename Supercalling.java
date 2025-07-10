package JavaBasics;
class Tom{
	Tom(int a)
	{
		System.out.println(" value of a is " + a);
	}
	}

class Cat extends Tom{
	Cat(int a,int b)
	{
	
		super(5);
		System.out.println("Addition of numbers" +(a+b));
	}
	}
class Puppy extends Cat{
	Puppy(double b)
	{
		super(2,4);
		
		System.out.println("salary of Puppy"+ b);
	}
}

public class Supercalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Puppy(2000.7);



	}

}







