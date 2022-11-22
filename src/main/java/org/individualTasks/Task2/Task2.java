package org.individualTasks.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static Integer insertTableSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the size of the table");
        Integer tableSize = scanner.nextInt();
        return tableSize;
    }

    public static Integer insertTableValue(Integer whichTableValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please insert value number: %d\n", whichTableValue);
        Integer vaLueOfTableELement = scanner.nextInt();
        return vaLueOfTableELement;
    }


    public static Integer[] createTable(Integer tableSize) {
        Integer[] resultTable = new Integer[tableSize];
        for (Integer i=0; i < tableSize; i++) {
            resultTable[i] = insertTableValue(i+1);
            }
        return resultTable;
        }

    public static Integer[] flippedTable(Integer[] insertedTable) {
        Arrays.sort(insertedTable);
        return insertedTable;
    }


}
