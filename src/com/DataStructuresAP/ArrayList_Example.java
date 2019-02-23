package com.DataStructuresAP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//tested with List i.e. ArrayList..methods tested are add(),addAll(),remove(),set()
public class ArrayList_Example
{
    private ArrayList<Integer>testList;

    public  ArrayList_Example()
    {
        testList=new ArrayList<>();
    }

    public ArrayList_Example(ArrayList<Integer> testList) {
        this.testList = testList;
    }

    public void arrayListTestRun(int []arr)
    {
        //add elements to ArrayList

        for(int i=0;i<arr.length;i++)
        {
            testList.add(arr[i]);
        }
        //insert one list into another list at a particular index
        List<Integer> list2=new ArrayList<>();
        list2.add(122);
        list2.add(192);
        list2.add(1992);
        list2.add(1290);
        System.out.println("Original List ="+testList);
        testList.addAll(1,list2);                //insets list2 into testList at index 1 and grows list
        System.out.println("Original List after inserting List2 :"+list2+"at index 1 becomes :"+testList);

        //remove an element from List at particular index
        testList.remove(2);                      //removes value at index 2
        System.out.println("After remove(2) List becomes:"+testList);
        testList.set(0,999);                           //replaces value at index 0 with 999
        System.out.println("List after set(0,999) becomes: "+testList);

    }
}
