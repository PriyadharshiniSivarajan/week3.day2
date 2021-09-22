package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInSet {

	public static void main(String[] args) {
		int[] a = {14,12,13,11,15,14,18,16,17,19,18,17,11};
		List<Integer> arrList =new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)   {
			for(int j=i+1;j<a.length;j++)
			{
		if(a[i]==a[j])
		{
			arrList.add(a[i]);
		}

	}
		}		
		System.out.println(arrList); 		
}
	}