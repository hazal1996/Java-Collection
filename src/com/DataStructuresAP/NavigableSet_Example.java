package com.DataStructuresAP;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

//following code tests NavigableSet on methods descendingSet(),lower(),higher()
public class NavigableSet_Example
{
    private NavigableSet<Integer>navigableSet;

    public NavigableSet_Example(NavigableSet<Integer> navigableSet)
    {
        this.navigableSet = navigableSet;
    }
    public NavigableSet_Example()
    {
        navigableSet=new TreeSet<>();
    }
    public void runNavigableSet(int []arr)
    {
        //add elements to navigableSet
        for(int i=0;i<arr.length;i++)
        {
            navigableSet.add(arr[i]);
        }
        System.out.println("NavigableSet is:"+navigableSet);
        NavigableSet<Integer>rn=navigableSet.descendingSet();
        System.out.println("Reverse NavigableSet is:"+rn);
        System.out.println("Lower("+arr[0]+") gives"+navigableSet.lower(arr[0]));
        System.out.println("Higher("+arr[0]+") gives"+navigableSet.higher(arr[0]));

    }

}
