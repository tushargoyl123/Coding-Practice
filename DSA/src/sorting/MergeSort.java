package sorting;

import java.util.ArrayList;

public class MergeSort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(3);
		mergeSort(al, 0, al.size()-1);
		System.out.println(al);
	}

	private static void mergeSort(ArrayList<Integer> al, int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;
			mergeSort(al, l, m);
			mergeSort(al, m + 1, r);
			merge(al, l, m, r);
		}
	}

	private static void merge(ArrayList<Integer> al, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		ArrayList<Integer> L = new ArrayList<Integer>();
		ArrayList<Integer> R = new ArrayList<Integer>();
		for (int i = 0; i < n1; i++) {
			L.add(al.get(l+i));
		}
		for (int i = 0; i < n2; i++) {
			R.add(al.get(m+1+i));
		}

		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2) {
			if (L.get(i) <= R.get(j)) {
				al.set(k, L.get(i));
				i++;
			} else {
				al.set(k, R.get(j));
				j++;
			}
			k++;
		}

		while (i < n1) {
			al.set(k, L.get(i));
			i++;
			k++;
		}
		while (j < n2) {
			al.set(k, R.get(j));
			j++;
			k++;
		}

	}
}
