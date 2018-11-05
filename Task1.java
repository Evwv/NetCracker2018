package Task3;

import java.util.Arrays;


public class Task1 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int size = 50;
        long timeWorkBubble = task1.bubble(task1.createArray(size));
        long timeWorkArSort = task1.arSort(task1.createArray(size));
        long timeWorkSelectionSort = task1.selectionSort(task1.createArray(size));
        long[] mas = new long[]{timeWorkBubble,timeWorkArSort,timeWorkSelectionSort};
        Arrays.sort(mas);
        System.out.println("Time work : Name of algoritm : Number of parametrs = " + size);
        for (long result : mas) {
            if (result == timeWorkBubble) {
                System.out.println(result + " : " + "bubbleSort");
            } else if (result == timeWorkArSort) {
                System.out.println(result + " : " + "arraysSort");
            } else System.out.println(result + " : " + "selectionSort");
        }
    }

    public int[] createArray(int size) {
        int[] mas = new int[size];

        for (int i = 0; i < size; i++) {
            mas[i] = (int) (Math.random()*101);
        }
        return mas;
    }

    public long bubble(int[] mas) {
        long startTime = System.nanoTime();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] > mas[i]) {
                    int x = mas[i];
                    mas[i] = mas[j];
                    mas[j] = x;
                }
            }
        }

        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public long arSort(int[] mas) {
        long startTime = System.nanoTime();

        Arrays.sort(mas);

        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public long  selectionSort(int[] mas) {
        long startTime = System.nanoTime();
        int min, temp;

        for (int index = 0; index < mas.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < mas.length; scan++) {
                if (mas[scan] < mas[min])
                    min = scan;
            }
            temp = mas[min];
            mas[min] = mas[index];
            mas[index] = temp;
        }

        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }
}