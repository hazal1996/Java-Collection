package com.DataStructuresAP;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_Example
{
    private SortedSet<String>sortedSet;

    public SortedSet_Example(SortedSet<String> sortedSet)
    {
        this.sortedSet = sortedSet;
    }
    public SortedSet_Example()
    {
        sortedSet=new TreeSet<>();

    }
    public void runSortedSet(String []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            sortedSet.add(arr[i]);                    //duplicates not allowed
        }
        sortedSet.add("Hello");
        sortedSet.add("Dollar");
        sortedSet.add("zebra");
        sortedSet.add("Hello");
        System.out.println("Original sorted set:"+sortedSet+" with size="+sortedSet.size());
        System.out.println("Getting first element using first() gives:"+sortedSet.first());
        System.out.println("Getting last element using last() gives:"+sortedSet.last());
        //System.out.println("Getting first element using first() gives:"+sortedSet.headSet("some value"));
    }

}
