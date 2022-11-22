package org.individualTasks.Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {

    public static List<String> particularStrings(List<String> stringsToConvert) {
        List<String> resultList = stringsToConvert.stream().filter((s) -> s.startsWith("a")).
                filter((d) -> d.toCharArray().length==3).collect(Collectors.toList());
        return resultList;
    }

    public static void main(String[] args) {
        List<String> exampleStringList = Arrays.asList("ala", "Ala", "abc", "awokado");
        List<String> convertedStringList = particularStrings(exampleStringList);
        System.out.println(convertedStringList);
    }

}
