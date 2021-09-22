package week3.day2;


import java.util.LinkedHashSet;

import java.util.Set;

public class RemoveDuplicateInSetString {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		String str1="";
		Set<String> setStr = new LinkedHashSet<String>();
        	for(int i=0;i<split.length;i++)
        	{
        		setStr.add(split[i]);
        	}
System.out.println("The set after removing duplicates " +setStr);
for(String str2:setStr)
{
	str1=str1+ " "+str2;
}

System.out.println("The string after removing duplicate is "+ str1);
}
}