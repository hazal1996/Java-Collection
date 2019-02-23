package com.DataStructuresAP;

import java.util.Scanner;

//All examples called here
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner takeUserInput = new Scanner(System.in);
        int [] testArray=new int[6];
        System.out.println("Enter 6 values for int test array: ");
        for(int i=0;i<6;i++)
        {
                testArray[i] = takeUserInput.nextInt();
        }
        Scanner takeUserInputStr = new Scanner(System.in);
        String [] strTestArray=new String[6];
        System.out.println("Enter 6 values for String test array: ");
        for(int i=0;i<6;i++)
        {
            strTestArray[i] = takeUserInputStr.next();
        }

        //menu to test all structures one by one
        char exitTesting = 'y';
        int collectionNo=1;

        while(exitTesting=='y')
        {
            System.out.println("To test Array press 1");
            System.out.println("To test ArrayList press 2");
            System.out.println("To test HashSet press 3");
            System.out.println("To test List press 4");
            System.out.println("To test NavigableSet press 5");
            System.out.println("To test NavigableMap press 6");
            System.out.println("To test Set press 7");
            System.out.println("To test SortedSet press 8");
            System.out.println("To test TreeSet press 9");
            System.out.println("To test Vector press 10");
            collectionNo=takeUserInput.nextInt();
            switch (collectionNo)
            {
                case 1:
                    System.out.println("Testing Arrays");
                    Array_Example array=new Array_Example(testArray);
                    array.arrayMenu();
                    break;
                case 2:
                    System.out.println("Testing ArrayList");
                    ArrayList_Example arrayList=new ArrayList_Example();
                    arrayList.arrayListTestRun(testArray);
                    break;
                case 3:
                    System.out.println("Testing HashSet");
                    HashSet_Example hashSet=new HashSet_Example();
                    hashSet.runHashSet(strTestArray);
                    break;
                case 4:
                    System.out.println("Testing List");
                    List_Example list=new List_Example();
                    list.listTestRun(testArray);
                    break;
                case 5:
                    System.out.println("Testing NavigableMap");
                    NavigabelMap_Example navigabelMap=new NavigabelMap_Example();
                    navigabelMap.runNavigableMap();
                    break;
                case 6:
                    System.out.println("Testing NavigableSet");
                    NavigableSet_Example navigableSet=new NavigableSet_Example();
                    navigableSet.runNavigableSet(testArray);
                    break;
                case 7:
                    System.out.println("Testing Set");
                    Set_Example set=new Set_Example();
                    set.runHashSet(strTestArray);
                    break;
                case 8:
                    System.out.println("Testing SortedSet");
                    SortedSet_Example sortedSet=new SortedSet_Example();
                    sortedSet.runSortedSet(strTestArray);
                    break;
                case 9:
                    System.out.println("Testing TreeSet");
                    TreeSet_Example treeSet=new TreeSet_Example();
                    treeSet.runTreeSet(strTestArray);
                    break;
                case 10:
                    System.out.println("Testing Vector");
                    Vector_Example vector=new Vector_Example();
                    vector.runVectorTest();
                    break;
                default:
                    System.out.println("None Chosen");
            }
            Scanner exitInput = new Scanner(System.in);
            System.out.println("To continue testing press 'y' else press any other key");
            exitTesting=exitInput.next().charAt(0);

        }


    }
}
