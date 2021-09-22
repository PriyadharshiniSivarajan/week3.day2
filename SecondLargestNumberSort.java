package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumberSort {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> str = new ArrayList<Integer>();
		for(int i=0;i<data.length;i++)
		{
			str.add(data[i]);
		}
		System.out.println("The set is"+str);
		Collections.sort(str);
		Collections.reverse(str);
		System.out.println("The sorted set is"+str);
		System.out.println("The second largest is"+str.get(1));
	}

}
