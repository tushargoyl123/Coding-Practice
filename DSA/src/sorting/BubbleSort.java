package sorting;

import java.util.ArrayList;

public class BubbleSort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(3);
		bubbleSort(al, al.size());
		System.out.println(al);
	}

	private static void bubbleSort(ArrayList<Integer> al, int n) {
		for(int i=0; i<n-1; i++) {
			boolean swapped = false;
			for(int j=0; j<n-1; j++) {
				if(al.get(j)>al.get(j+1)) {
					swap(al,j,j+1);
					swapped = true;
				}
			}
			if(!swapped) break;
		}
	}
	
	private static void swap(ArrayList<Integer> al, int i, int f) {
		int temp = al.get(i);
		al.set(i, al.get(f));
		al.set(f, temp);
	}
}
