package JavaBasics;



public class thiskeyword {
	String name;
	int age;
	public void userid(String name,int age) {
		this.name=name;
		this.age=age;
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thiskeyword th=new thiskeyword();
		th.userid("Arfan", 2);
	System.out.println(th.name);
	System.out.println(th.age);
	
	
	}

}
