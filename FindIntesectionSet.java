package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntesectionSet {

	public static void main(String[] args) {
int a[]= {3,2,11,4,6,7};
int b[]= {1,2,8,4,9,7};
Set<Integer> str =new LinkedHashSet<Integer>();
Set<Integer> str1 =new LinkedHashSet<Integer>();

for(int i=0;i<a.length;i++)
{
	str.add(a[i]);
	str.add(b[i]);
	if(a[i]==b[i])
	{
	str1.add(a[i]);	
	}
	}

System.out.println("The original set"+str);
System.out.println("The duplicate set "+str1);
str.removeAll(str1);

	System.out.println("After removing duplicates set is " +str);

		

}}
