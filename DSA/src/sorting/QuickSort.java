package sorting;

import java.util.ArrayList;

public class QuickSort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(3);
		quickSort(al, 0, al.size()-1);
		System.out.println(al);
	}
	
	private static int partition(ArrayList<Integer> al, int low, int high) {
		int pivot = al.get(high);
		int i = low-1;
		for(int j=low; j<=high-1; j++) {
			if(al.get(j)<pivot) {
				i++;
				swap(al,i,j);
			}
			
		}
		swap(al,i+1,high);
		return i+1;
	}
	
	private static void quickSort(ArrayList<Integer> al, int low, int high) {
		if(low<high) {
			int p = partition(al, low, high);
			quickSort(al, low, p-1);
			quickSort(al, p+1, high);
		}
	}
			
	
	private static void swap(ArrayList<Integer> al, int i, int f) {
		int temp = al.get(i);
		al.set(i, al.get(f));
		al.set(f, temp);
	}
	
}
