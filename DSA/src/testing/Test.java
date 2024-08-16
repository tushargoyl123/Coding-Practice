package testing;

import java.util.*;
public class Test {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
			al.add(new ArrayList<Integer>());
			al.add(new ArrayList<Integer>());
			al.add(new ArrayList<Integer>());
			al.add(new ArrayList<Integer>());
			al.get(0).add(1);
			al.get(0).add(2);
			al.get(0).add(3);
			al.get(1).add(4);
			al.get(1).add(5);
			al.get(1).add(6);
			al.get(2).add(7);
			al.get(2).add(8);
			al.get(2).add(9);
			al.get(2).add(10);
			al.get(3).add(11);
			al.get(3).add(12);
			System.out.println(al);
			for(int i=0; i<al.size(); i++) {
				for(int j=0; j<al.get(i).size(); j++) {
					System.out.print(al.get(i).get(j)+" ");
				}
				System.out.println();
			}
			
			for(ArrayList<Integer> i : al) {
				for(Integer j : i) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			Iterator<ArrayList<Integer>> iter = al.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
	}
}
