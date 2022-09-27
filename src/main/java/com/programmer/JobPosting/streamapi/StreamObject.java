package com.programmer.JobPosting.streamapi;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface StreamObject {
    public static void main(String[] args) {

//        1)
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
        });

//        2)
        String names[] ={"Mohammed","Ahmed","Anwar"};
        Stream<String> stringStream = Stream.of(names);
        stringStream.forEach(e -> System.out.println(e));

//        3)
        Stream<Object> builder = Stream.builder().add("Khansaa").add("Amiara").build();
        builder.forEach(e-> System.out.println(e));

//        4)
        IntStream streamArray = Arrays.stream(new int[]{1, 2, 6, 3, 8, 10});
        streamArray.forEach(e-> System.out.println(e));
//        5)
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(44);
        list.add(66);
        list.add(89);
        List<Integer> collectValues = list.stream().collect(Collectors.toList());
        collectValues.forEach(e-> System.out.println(e));
//6)
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(44);
        set.add(66);
        set.add(89);
        Stream<Integer> stream = set.stream();
        stream.forEach(e-> System.out.println(e));

//        7)
        HashMap map = new HashMap();
        map.put("A",10);
        map.put("A",20);
        map.put("A",130);



    }
}
