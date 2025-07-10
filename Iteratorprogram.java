package JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Iteratorprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		Iterator<Integer> i=a1. iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		ListIterator<Integer> i1=a1.listIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println(".........");
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
		
		

	}

}
