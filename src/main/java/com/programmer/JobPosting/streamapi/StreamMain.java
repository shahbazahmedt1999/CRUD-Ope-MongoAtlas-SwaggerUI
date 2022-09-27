package com.programmer.JobPosting.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamMain {
//    Before Stream or without stream Api
public static void main(String[] args) {

    /*
    create a list and filter out all the even numbers
     */
    List<Integer> list = List.of(2,10,50,21,22,67);
    // list.add(24); // This line gives an error as "UnsupportedOperationException" bcoz List.of()-> won't add the element by using the function called add().
    System.out.println(list);
    // Removing the list of even number present in the list
    List<Integer> listEven = new ArrayList<>();
    for(Integer i : list){
        if(i % 2 ==0) {
            listEven.add(i);
        }
    }
    System.out.println(listEven);
    System.out.println(listEven);
}
}
