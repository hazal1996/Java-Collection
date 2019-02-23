package com.DataStructuresAP;

//tested with List i.e. ArrayList..methods tested are add(),addAll(),remove(),set()

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Example
{
    private List<Integer> testList;

    public List_Example(List<Integer> testList)
    {

        this.testList = testList;
    }
    public  List_Example()
    {
        testList=new ArrayList<>();
    }

    public void listTestRun(int []arr)
    {
        //add elements to List
        for(int i=0;i<arr.length;i++)
        {
            testList.add(arr[i]);                //allows duplicates
        }
        //insert one list into another list at a particular index
        List<Integer>list2=new ArrayList<>();
        System.out.println("Original List ="+testList);
        testList.addAll(1,list2);                //insets list2 into testList at index 1 and grows list
        System.out.println("Original List after inserting List2 :"+list2+"at index 2 becomes :"+testList);

        //remove an element from List at particular index
        testList.remove(2);                      //removes value at index 2
        System.out.println("After remove(2) List becomes:"+testList);
        testList.set(0,999);                           //replaces value at index 0 with 999
        System.out.println("List after set(0,999) becomes: "+testList);

    }
}
