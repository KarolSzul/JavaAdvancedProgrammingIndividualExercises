package org.zadania.Task1;

public class Task1 {

    public static class EvenNumberThread extends Thread {

        private final Integer min;
        private final Integer max;

        public EvenNumberThread(Integer min, Integer max, String name) {
            super(name);
            this.min = min;
            this.max = max;
        }


        @Override
        public void run() {
            for (Integer i = min; i <= max; i++) {
                if (i%2 == 0) {
                    System.out.printf("%s: %d\n", Thread.currentThread().getName(), i);
                }
            }
        }

    }

    public static void excercise() {

        Thread threadA = new EvenNumberThread(1000, 2000, "Thread A");
        Thread threadB = new EvenNumberThread(14300, 17800, "Thread B");

        threadA.start();
        threadB.start();

    }

}
