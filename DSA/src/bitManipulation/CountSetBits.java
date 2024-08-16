package bitManipulation;

public class CountSetBits {
	public static void main(String[] args) {
		int n = 3256;
		int count = countSetBits(n);
		System.out.println(count);
	}
	
	private static int countSetBits(int n) {
		int count = 0;
		while(n>0) {
			int lb = n&1;
			count+=lb;
			n=n>>1;
		}
		return count;
	}
}
