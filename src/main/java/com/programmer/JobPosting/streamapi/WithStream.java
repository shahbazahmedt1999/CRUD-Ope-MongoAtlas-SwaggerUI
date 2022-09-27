package com.programmer.JobPosting.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class WithStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 90, 30, 89);
        List<Integer> integerList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(integerList);

    }
}
