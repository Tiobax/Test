package com.company;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        String str = "df32dfs,f";
//        Map<String, Long> result = str.chars().mapToObj(value -> String.valueOf((char)value)).
//
//      collect(Collectors.groupingBy(o -> o, Collectors.counting()));
//        str.chars().mapToObj(value -> String.valueOf((char)value)).filter(s -> s.matches("[A-Za-z]")).forEach(System.out::println);
//        System.out.println(result);
        List<Object> list = new ArrayList<>();
        list.add(new Dog("bobic"));
        list.add(new Dog("tyzic"));
        list.add(new Dog("sharic"));

        String str = (String) list.stream().reduce("", (o, o2) -> {
            if (o == "") return o2;
            else return o + "-" + o2;
        });
        System.out.println(str);
    }

    public static void dd() {

    }
}
