package com.DataStructuresAP;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Set_Example
{
    private Set<String> set;
    //HashSet<String> hashSet;
    public Set_Example()
    {
        set=new HashSet<>();
    }
    public void runHashSet(String []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);                          //duplicates are not allowed
        }
        Iterator<String> iterable=set.iterator();
        System.out.println("Printing out Set using Iterator");
        while(iterable.hasNext())
        {
            System.out.println(iterable.next());
        }
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string you would like to find in HashSet:");
        String str=input.next();
        if(set.contains(str))
        {
            System.out.println(str+" was found in the HashSet!");
        }
        else
        {
            System.out.println(str+" not found!");
        }
        if(set.isEmpty())
        {
            System.out.println("HashSet is empty!");
        }
        else
        {
            System.out.println("There are :"+set.size()+" elements in HashSet");
        }
    }
}
