package arrayList;

import java.util.ArrayList;

public class ArrayProducts {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(arrayProduct1(al, al.size()));
		System.out.println(arrayProduct2(al, al.size()));

	}

	private static ArrayList<Integer> arrayProduct1(ArrayList<Integer> al, int n) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int prod = 1;
			for (int j = 0; j < n; j++) {
				if (j == i)
					continue;
				prod *= al.get(j);
			}
			result.add(prod);

		}
		return result;
	}

	private static ArrayList<Integer> arrayProduct2(ArrayList<Integer> al, int n) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			result.add(1);
		}
		int temp = 1;
		for (int i = 0; i < n; i++) {
			result.set(i, temp);
			temp *= al.get(i);
		}

		temp = 1;
		for (int i = n - 1; i >= 0; i--) {
			result.set(i, temp * result.get(i));
			temp *= al.get(i);
		}
		return result;
	}
}
