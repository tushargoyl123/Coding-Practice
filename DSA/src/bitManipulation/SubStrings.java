package bitManipulation;

public class SubStrings {
	public static void main(String[] args) {
		String s = "abc";
		printSubstrings(s, s.length());
	}

	private static void printSubstrings(String s, int n) {
		for (int i = 0; i < 1 << n; i++) {
			for (int j = 0; j < n; j++) {
				int lb = (i & (1 << j));
				if (lb > 0) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
