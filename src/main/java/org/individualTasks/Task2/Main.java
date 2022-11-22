package org.individualTasks.Task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer tableSize = Task2.insertTableSize();
        Integer[] myTable = Task2.createTable(tableSize);
        Task2.flippedTable(myTable);
        System.out.println(Arrays.toString(myTable));
    }
}
