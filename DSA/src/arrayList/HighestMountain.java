package arrayList;

import java.util.ArrayList;

public class HighestMountain {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(-2);
		al.add(0);
		int size1 = highestMountain(al, al.size());
		int size = highestMountain2(al, al.size());		
		System.out.println(size1);
		System.out.println(size);
	}

	private static int highestMountain(ArrayList<Integer> al, int n) {
		int sizeFinal = 1;
		int size = 0;
		int depth = 0;
		int depthFinal = 0;
		boolean largest = false;
		for (int i = 0; i < n - 1; i++) {
			int current = al.get(i);
			int next = al.get(i + 1);
			if (current > next) {
				if (size > sizeFinal) {
					sizeFinal = size;
					size = 0;
					largest = true;
				}
				if (largest)
					depth++;
			} else {
				size++;
				if (depth > depthFinal) {
					depthFinal = depth;
					depth = 0;
				}
			}

		}
		return sizeFinal + depthFinal;
	}

	private static int highestMountain2(ArrayList<Integer> al, int n) {
		int largest = 0;
		for (int i = 1; i < n - 1;) {
			int current = al.get(i);
			int previous = al.get(i - 1);
			int next = al.get(i + 1);

			if (current > previous && current > next) {
				int count = 1;
				int j = i;
				while (j >= 1 && al.get(j) > al.get(j - 1)) {
					count++;
					j--;
				}
				while (i <= n - 2 && al.get(i) > al.get(i + 1)) {
					count++;
					i++;
				}
				largest = Math.max(largest, count);
			} else {
				i++;

			}
		}
		return largest;
	}
}
