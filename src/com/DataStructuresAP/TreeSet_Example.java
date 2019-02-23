package com.DataStructuresAP;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

//following code tests TreeSet for addAll(),descendingIterator(),descendingSet()

public class TreeSet_Example
{
    private TreeSet<String> treeSet;

    public TreeSet_Example(TreeSet<String> treeSet) {
        this.treeSet = treeSet;
    }
    public TreeSet_Example()
    {
        treeSet=new TreeSet<String>();
    }
    public void runTreeSet(String [] str)
    {
        treeSet.addAll(Arrays.asList(str));
        System.out.println("TreeSet Values are:"+treeSet);
        Iterator i=treeSet.descendingIterator();
        System.out.println("Running descending iterator on vector gives :");
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("Running descendingSet() on treeSet gives:"+treeSet.descendingSet());
    }
}
