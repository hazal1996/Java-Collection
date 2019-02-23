package com.DataStructuresAP;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//following code tests some methods provided for HashSet like Iterator(),contains(),isEmpty,size()
public class HashSet_Example
{
    private HashSet<String> hashSet;
    public HashSet_Example()
    {
        hashSet=new HashSet<>();
    }
    public void runHashSet(String []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            hashSet.add(arr[i]);         //duplicates are not allowed
        }
            Iterator<String> iterable=hashSet.iterator();
            while(iterable.hasNext())
            {
                System.out.println(iterable.next());
            }
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a string you would like to find in HashSet:");
            String str=input.next();
            if(hashSet.contains(str))
            {
                System.out.println(str+" was found in the HashSet!");
            }
            else
            {
                System.out.println(str+" not found!");
            }
            if(hashSet.isEmpty())
            {
                System.out.println("HashSet is empty!");
            }
            else
            {
                System.out.println("There are :"+hashSet.size()+" elements in HashSet");
            }
    }
}
