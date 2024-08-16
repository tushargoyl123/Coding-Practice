package sorting;

import java.util.ArrayList;

public class RadixSort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(3);
		radixSort(al, al.size());
		System.out.println(al);
	}

	private static void countSort(ArrayList<Integer> al, int n, int exp) {
		ArrayList<Integer> countAl = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			countAl.add(0);
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			output.add(0);
			int digit = (al.get(i) / exp) % 10;
			countAl.set(digit, countAl.get(digit) + 1);
		}
		for (int i = 1; i < countAl.size(); i++) {
			countAl.set(i, countAl.get(i - 1) + countAl.get(i));
		}
		for (int i = 0; i < al.size(); i++) {
			int idx1 = al.get(i);
			int idx2 = countAl.get(idx1) - 1;
			output.set(idx2, idx1);
		}
		for (int i = 0; i < al.size(); i++) {
			al.set(i, output.get(i));
		}

	}

	private static void radixSort(ArrayList<Integer> al, int n) {
		int mx = Integer.MIN_VALUE;
		for (int i = 0; i < al.size(); i++) {
			mx = Math.max(mx, al.get(i));
		}

		for (int exp = 1; mx / exp != 0; exp *= 10) {
			countSort(al, n, exp);
		}
	}
}
