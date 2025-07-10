package JavaBasics;

import java.util.Arrays;

public class Arrayequalsprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] rollnum=new int[3];
		rollnum[0]=34;
		rollnum[1]=45;
		rollnum[2]=38;
		
		int [] rollnum1=new int[3];
		rollnum[0]=34;
		rollnum[1]=45;
		rollnum[2]=38;
		
        boolean b1     =   Arrays.equals(rollnum, rollnum1);
        if(b1==true)
        {
        	System.out.println("arrays are equal");
        	
        }
        
        else
        {
        	System.out.println("arrays are not equal");
        }
        
        
        
        
        
	}
	
	
	
	

}
