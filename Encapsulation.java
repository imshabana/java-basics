package JavaBasics;

public class Encapsulation {
	private String un="grotechminds@gmail.com";
	

	public String getUn() {
		return un;
	}


	public void setUn(String un) {
		this.un = un;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e1=new Encapsulation();
		e1.setUn("Shabana@gmail.com");
		System.out.println(e1.getUn());
		
		

	}

}
