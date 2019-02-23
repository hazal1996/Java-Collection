package com.DataStructuresAP;

import java.util.Arrays;

//following code snippet is an example of Array in java, methods clone(),equals(),contains(),length(),toString() are tested
public class Array_Example
{
    private int [] testArray;

    public Array_Example(int[] testArray)
    {
        this.testArray = testArray;
    }

    public int[] getTestArray()
    {
        return testArray;
    }

    public void setTestArray(int[] testArray)
    {
        this.testArray = testArray;
    }
    public void arrayMenu()
    {
        //following shows how deep copy works in Arrays
        int []copyIn=testArray.clone();
        System.out.println("clone() method testing :");
        System.out.println("Original Array :"+ Arrays.toString(testArray));
        System.out.println(("Cloned Array :"+Arrays.toString(copyIn)));
        if(copyIn==testArray)
        {
            System.out.println("Memory reference of original array and cloned array same? " + true);
        }
        else
        {
            System.out.println("Memory reference of original array and cloned array same? "+false);
        }

        //following shows how equality of two arrays can be checked
        int[] arr2=new int[]{1,2,3,4,5,6,7,8,8,10};
        System.out.println("Array 1 :"+Arrays.toString(testArray)+" and Array 2:"+Arrays.toString(arr2)+"are equal ?"+arr2.equals(testArray));
        String stringValue=testArray.toString();
        System.out.println("After toString method on original array we get :"+stringValue);




    }
}
