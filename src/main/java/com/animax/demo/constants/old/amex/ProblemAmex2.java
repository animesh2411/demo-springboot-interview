package com.animax.demo.constants.old.amex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemAmex2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Animesh");
        names.add("Rahul");
        names.add("naman");
        names.add("ramar");

        //only gives last added
        List<String> filterName = new ArrayList<>();
        for (String name : names) {
            char first = name.charAt(0);
            String firstLetter = String.valueOf(first);
            filterName = names.stream().filter(n -> n.startsWith(firstLetter) && n.endsWith(firstLetter))
                    .collect(Collectors.toList());
        }
        System.out.println(filterName);


        // correct
        List<String> filterName2 = new ArrayList<>();

        names.stream().filter(name -> {
                    char first = name.charAt(0);
                    String firstLetter = String.valueOf(first);
                    return name.startsWith(firstLetter) && name.endsWith(firstLetter);
                })
                .forEach(filterName2::add);

        System.out.println(filterName2);

        // correct
        List<String> filterName3 = new ArrayList<>();
        for (String name : names) {
            char first = name.charAt(0);
            String firstLetter = String.valueOf(first);
            filterName3 = names.stream().filter(n -> n.startsWith(firstLetter) && n.endsWith(firstLetter)).collect(Collectors.toList());
            filterName3.addAll(filterName3);
        }
        System.out.println(filterName3);
    }
}
