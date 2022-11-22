package org.individualTasks.Task4;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static List<String> stringsInUpperCase(List<String> stringsToConvert) {
        List<String> resultList = stringsToConvert.stream().map(String::toUpperCase).collect(Collectors.toList());
        return resultList;
    }

    public static void main(String[] args) {
        List<String> exampleStringList = Arrays.asList("Karol", "dog", "aBdF");
        List<String> convertedStringList = stringsInUpperCase(exampleStringList);
        System.out.println(convertedStringList);

    }


}
