package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementSet {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 ,9,10};
		List<Integer> listArr = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			listArr.add(arr[i]);
		}
		Collections.sort(listArr);
		System.out.println(listArr);
		int size = listArr.size();
		for (int i = 0; i < size ; i++) { 
if((i+1)!=listArr.get(i)){
	
	System.out.println(i+1);
	break;
}
	
}
		}

	}
