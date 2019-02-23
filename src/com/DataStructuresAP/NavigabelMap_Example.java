package com.DataStructuresAP;

import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;
//following code tests Navigable Map on methods like put(),FirstEntry(),descendingMap()
public class NavigabelMap_Example
{
    private NavigableMap<String,Integer> navigableMap;//string key and integer value

    public NavigabelMap_Example(NavigableMap<String, Integer> navigableMap)
    {
        this.navigableMap = navigableMap;
    }
    public NavigabelMap_Example()

    {
        navigableMap=new TreeMap<>();
    }
    public void runNavigableMap()
    {
        System.out.println("Fill The NavigableMap with Values:");
        for(int i=0;i<4;i++)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter Key ");
            String key=input.next();
            System.out.println("Enter an integer  Value");
            int value=input.nextInt();
            navigableMap.put(key,value);
        }
        System.out.println("NavigableMap (key,value) is:"+navigableMap);
        System.out.println("Descending Map is:"+navigableMap.descendingMap());
        System.out.println("First Entry is:"+navigableMap.firstEntry());


    }
}
