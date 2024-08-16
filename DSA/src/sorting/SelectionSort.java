package sorting;

import java.util.ArrayList;

public class SelectionSort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(3);
		selectionSort(al, al.size());
		System.out.println(al);
	}
	
	private static void selectionSort(ArrayList<Integer> al, int n) {
		int minIdx;
		for(int i=0; i<n-1; i++) {
			minIdx = i;
			for(int j=i+1; j<n; j++) {
				if(al.get(minIdx)>al.get(j)) {
					minIdx = j;
				}
			}
			if(minIdx!=i) swap(al, i, minIdx);
			
		}
	}
	
	private static void swap(ArrayList<Integer> al, int i, int f) {
		int temp = al.get(i);
		al.set(i, al.get(f));
		al.set(f, temp);
	}
}
