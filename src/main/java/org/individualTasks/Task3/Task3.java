package org.individualTasks.Task3;

import java.util.Arrays;
import java.util.List;

public class Task3 {

    public static double average(List<Integer> numbers) {

        double result =  numbers.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6,2,13,1,5);
        double avg = average(numbers);
        System.out.println(avg);
    }

}
