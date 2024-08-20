package bitManipulation;

import java.util.ArrayList;

public class UniqueTwo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(3);
		al.add(5);
		al.add(8);
		uniqueTwo(al, al.size());
	}

	private static void uniqueTwo(ArrayList<Integer> al, int n) {
		int xor = 0;
		for (int i = 0; i < n; i++) {
			xor ^= al.get(i);
		}
		int xorFinal = xor;
		int place = -1;
		while (xor > 0) {
			place++;
			int ld = xor & 1;
			if (ld == 1) {
				break;
			}
			xor >>= 1;
		}
		int xorNew = 0;
		int dig = 1 << place;
		for (int i = 0; i < n; i++) {
			if ((al.get(i) & dig) > 0) {
				xorNew ^= al.get(i);
			}
		}
		int A = xorNew;
		int B = xorFinal ^ xorNew;
		System.out.println(A);
		System.out.println(B);
	}
}
