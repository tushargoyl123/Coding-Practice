package sorting;

import java.util.ArrayList;

public class InsertionSort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(3);
		insertionSort(al, al.size());
		System.out.println(al);
	}
	
	public static void insertionSort(ArrayList<Integer> al, int n) {
		for(int i=1; i<n; i++) {
			int j = i-1;
			int key = al.get(i);
			while(j>=0  && al.get(j)>key) {
				al.set(j+1, al.get(j));
				j--;
			}
			al.set(j+1, key);
		}
	}
	
}
