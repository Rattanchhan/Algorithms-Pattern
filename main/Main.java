package main;

// import DataStructure_Algorithms.Search.*;
import DataStructure_Algorithms.Sort.*;
import DataStructure_Algorithms.Stack.Stack;

public class Main {
    public static void main(String[] args) {
        int[] numbers= {5,4,10,1,6,2};
        // InsertSort insertSort = new InsertSort();
        // for (int i : insertSort.insertSort(numbers)) {
        //     System.out.println(i);
        // }

    //    StarPattern.pattern24();
    //       BinarySearch binarySearch = new BinarySearch();
    //    System.out.println(binarySearch.findNumber(4));

        Stack stack  = new Stack();
        stack.push(90);
        stack.push(49);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(100);
        System.out.println(stack.peek());

    }
}
