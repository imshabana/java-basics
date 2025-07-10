package Collectionsprograms;

import java.util.ArrayList;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		list.remove(2);
		
		ArrayList<Integer> list1=new ArrayList();
list1.add(50);
list1.add(60);
list1.addAll(list);
System.out.println(list1);
System.out.println(list1.contains(50));
System.out.println(list1.size());


	}

}
