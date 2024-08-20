package arrayList;

import java.util.*;
public class FizzBuzz {
	
	private static ArrayList<String> fizzbuzz(int n){
		ArrayList<String> result = new ArrayList<String>();
		for(int i=1; i<=n; i++) {
			if(i%3==0 && i%5==0) result.add("FizzBuzz");
			else if(i%3==0) result.add("Fizz");
			else if(i%5==0) result.add("Buzz");
			else result.add(Integer.toString(i));
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(fizzbuzz(17));
	}
}
