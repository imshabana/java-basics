package JavaBasics;

public class Nonstaticmethodcalling {
	void add()
	{
		System.out.println("addition");
	}
	void sub()
	{
		System.out.println("subtraction");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonstaticmethodcalling n1=new Nonstaticmethodcalling();
		n1.add();
        n1.sub();   
	}

}
