package sorting;

import java.util.ArrayList;

public class BucketSort {
	public static void main(String[] args) {
		ArrayList<Float> al = new ArrayList<Float>();
		al.add(0.897f);
		al.add(0.565f);
		al.add(0.656f);
		al.add(0.1234f);
		al.add(0.665f);
		al.add(0.3434f);
		bucketSort(al, al.size());
		System.out.println(al);
	}

	private static void bucketSort(ArrayList<Float> al, int n) {
		ArrayList<ArrayList<Float>> buckets = new ArrayList<ArrayList<Float>>();
		for (int i = 0; i < n; i++) {
			buckets.add(new ArrayList<Float>());
		}
		for (int i = 0; i < n; i++) {
			int bucketIndex = (int) (n * al.get(i));
			buckets.get(bucketIndex).add(al.get(i));
		}
		for (int i = 0; i < n; i++) {
			insertionSort(buckets.get(i));
		}
		int idx = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < buckets.get(i).size(); j++) {
				al.set(idx, buckets.get(i).get(j));
				idx++;
			}
		}
	}

	private static void insertionSort(ArrayList<Float> al) {
		for (int i = 1; i < al.size(); i++) {
			float key = al.get(i);
			int j = i - 1;
			while (j >= 0 && al.get(j) > key) {
				al.set(j + 1, al.get(j));
				j--;
			}
			al.set(j + 1, key);
		}
	}
}
