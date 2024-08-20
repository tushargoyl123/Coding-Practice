package sorting;

import java.util.ArrayList;

public class CountSort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(4);
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(3);
		countSort(al, al.size());
	}

	private static void countSort(ArrayList<Integer> al, int n) {
		int mx = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			mx = Math.max(mx, al.get(i));
		}
		ArrayList<Integer> countAl = new ArrayList<Integer>();
		for(int i=0; i<=mx; i++) {
			countAl.add(0);
		}
		ArrayList<Integer> outputAl = new ArrayList<Integer>();
		for(int i=0; i<al.size(); i++) {
			outputAl.add(0);
			int index = al.get(i);
			countAl.set(index, countAl.get(index)+1);
		}
		for(int i=1; i<countAl.size(); i++) {
			countAl.set(i, countAl.get(i)+countAl.get(i-1));
		}
		for(int i=n-1; i>=0; i--) {
			outputAl.set(countAl.get(al.get(i))-1, al.get(i));
			countAl.set(countAl.get(al.get(i)), countAl.get(al.get(i))-1);
			
		}
		System.out.println(outputAl);
	}
}
