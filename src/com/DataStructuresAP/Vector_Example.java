package com.DataStructuresAP;

import java.util.ArrayList;
import java.util.Vector;

//following code test Vector on methods add(),addAll(),contains()
public class Vector_Example
{
    private Vector v;

    public Vector_Example(Vector v) {
        this.v = v;
    }
    public Vector_Example()
    {
        v=new Vector();
    }
    public void runVectorTest()
    {
        v.add(1);
        v.add(2);
        v.add("Hello World");
        v.add("PAK");
        System.out.println("Current Values in Vector are:"+v);
        System.out.println("Check vector contains element 1:"+v.contains(1));
        ArrayList arr=new ArrayList();
        arr.add(1);
        arr.add(999);
        arr.add(234);
        v.addAll(0,arr);                   //insert ArrayList arr at index 0 and grows the vector
        System.out.println("After inserting arr :"+arr+" at index 0,original vector becomes :"+v);
    }
}
