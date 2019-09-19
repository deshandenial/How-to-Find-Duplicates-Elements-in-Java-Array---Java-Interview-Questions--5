package com.duplicate_element;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_Element_in_Array 
{
	public static void main(String[] args)
	{
	
		String[] namelist = {"JAVA", "C#","PHP", "ANDROID", "JAVA"};
		
		System.out.println(namelist.length);
		
		for (int i = 0 ; i<namelist.length ; i++)
		{
			//System.out.println("print names :"+namelist[i]);
			
			for(int j = i + 1 ;j<namelist.length ; j++)
			{
				if(namelist[i].equals(namelist[j]))
				{
				  System.out.println("Duplicate value :" + namelist[i]);	
				}
				
			}
		}
		
		
		Set<String> store = new HashSet<String>();
		
		for(String name : namelist)
		{
			if(store.add(name)==false)
			{
				System.out.println("Duplicate value :" +name);
			}
		}
		
	}

}
