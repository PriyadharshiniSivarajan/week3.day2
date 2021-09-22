package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PayPalString {

	public static void main(String[] args) {
		String str = "PayPal india";
		char[] q = str.toCharArray();
		Set<Character> original = new LinkedHashSet<Character>();
		Set<Character> duplicate = new LinkedHashSet<Character>();
		for (int i = 0; i < (q.length); i++) {
			for (int j= i+1; j < (q.length); j++)
			{if(q[i]!=' ')
				original.add(q[i]);
			if(q[i]==q[j])
			{
      duplicate.add(q[i]);

		}
		}
		}
			
		
		System.out.println("The origingal string is " +original);
	
		System.out.println("The duplicate values are"+duplicate);
		 original.removeAll(duplicate);
		System.out.println("The set without duplicates is" +original);
}
}