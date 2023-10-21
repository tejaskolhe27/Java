package Collections;

import java.util.*;
public class TesterVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println(v);
		
		for(Integer val:v)
		{
			System.out.println(val+" ");
		}
		
		System.out.println();
		
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}

	}

}
