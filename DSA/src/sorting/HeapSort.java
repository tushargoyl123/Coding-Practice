package sorting;

import java.util.ArrayList;

public class HeapSort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(3);
		int N = al.size();
		for (int i = N / 2 - 1; i >= 0; i--) {
			heapify(al, N, i);
		}

		for (int i = N - 1; i > 0; i--) {
			swap(al, 0, i);
			heapify(al, i, 0);
		}
		System.out.println(al);
	}

	private static void heapify(ArrayList<Integer> al, int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < n && al.get(largest) < al.get(left)) {
			largest = left;
		}
		if (right < n && al.get(largest) < al.get(right)) {
			largest = right;
		}

		if (largest != i) {
			swap(al, largest, i);
			heapify(al, n, largest);
		}
	}

	private static void swap(ArrayList<Integer> al, int i, int f) {
		int temp = al.get(i);
		al.set(i, al.get(f));
		al.set(f, temp);
	}
}
