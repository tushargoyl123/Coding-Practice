package bitManipulation;

import java.util.ArrayList;

public class UniqueOne {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(3);
		al.add(5);
		int unique = uniqueOne(al, al.size());
		System.out.println(unique);
	}

	private static int uniqueOne(ArrayList<Integer> al, int n) {
		int xor = 0;
		for (int i = 0; i < n; i++) {
			xor ^= al.get(i);
		}
		return xor;
	}
}
