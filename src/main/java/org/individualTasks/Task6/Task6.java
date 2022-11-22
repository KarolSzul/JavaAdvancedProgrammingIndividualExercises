package org.individualTasks.Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Task6 {

//    public static String listToString(List<Integer> integersToConvert) {
//        String result =  integersToConvert.stream().count(Collectors.joining())
//
//        return result
//    }


    public static String integerListToString(List<Integer> integersToConvert) {

        List<String> listOfStrings = new ArrayList<>();

        for(Integer element :integersToConvert) {

                if (element % 2 == 0) {
                    listOfStrings.add("e" + element.toString());
                } else {
                    listOfStrings.add("o" + element.toString());
                }

            }

        String resultString = String.join(",", listOfStrings);
        return resultString;
        }



        public static void main (String[]args){
            List<Integer> exampleIntegerList = Arrays.asList(1, 2, 5, 8, 10, 13, 12);
            System.out.println(integerListToString(exampleIntegerList));
        }

    }

