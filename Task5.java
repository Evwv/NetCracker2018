package Task3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task5<sizeRow> {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        System.out.println("task5a");
        task5.task5a();
        System.out.println("task5b");
        task5.task5b();
        System.out.println("task5c");
        task5.task5c();
        System.out.println("task5d");
        task5.task5d();

    }

    public void task5a() {
        int sizeRow = 8;
        int sizeCol = 8;
        int[][] mas = new int[sizeRow][sizeCol];
        int sumMain = 0; long prMain = 1;
        int sumSide = 0; long prSide = 1;

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                mas[i][j] = 1 + (int) (Math.random() * 99);
                System.out.print(mas[i][j] + "    ");
            }
            System.out.println();
        }

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                if (i == j) {
                    sumMain += mas[i][j];
                    prMain *= mas[i][j];
                }
                if (j == sizeCol-1-i) {
                    sumSide += mas[i][j];
                    prSide *= mas[i][j];
                }
            }
        }

        System.out.println("Summ main diagonal = " + sumMain + " Multiplication = " + prMain);
        System.out.println("Summ side diagonal = " + sumSide + " Multiplication = " + prSide);
    }

    public void task5b() {
        int sizeRow = 8;
        int sizeCol = 5;
        int[][] mas = new int[sizeRow][sizeCol];

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                mas[i][j] = -99 + (int) (Math.random() * 199);
                System.out.print("  " + mas[i][j] + "  ");
            }
            System.out.println();
        }

        int max = mas[0][0];
        int numberi = 0,numberj = 0;

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                if (mas[i][j] > max) {
                    max = mas[i][j];
                    numberi = i;
                    numberj = j;
                }
            }
        }

        System.out.println("Max value = " + max + " with index i,j = " + numberi + "," + numberj );
    }

    public void task5c() {
        int sizeRow = 8;
        int sizeCol = 5;
        int[][] mas = new int[sizeRow][sizeCol];
        int numberRow = 0;
        int max = 0;
        int prRow = 1;

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                mas[i][j] = -10 + (int) (Math.random() * 21);
                System.out.print(mas[i][j] + "    ");
            }
            System.out.println();
        }

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                prRow*= Math.abs(mas[i][j]);
            }
            if (prRow > max) {
                max = prRow;
                numberRow = i;
            }
            prRow = 1;
        }

        System.out.println(" Max prRow index = " + numberRow);
    }

    public void task5d() {
        int sizeRow = 10;
        int sizeCol = 7;
        int[][] mas = new int[sizeRow][sizeCol];

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                mas[i][j] =  (int) (Math.random() * 101);
                System.out.print(mas[i][j] + "    ");
            }
            System.out.println();
        }

        for (int i = 0; i < sizeRow; i++) {
            Arrays.sort(mas[i]);
        }
        System.out.println();
        System.out.println("After change");
        System.out.println();

        for (int i = 0; i < sizeRow; i++) {
            for (int j = sizeCol-1; j > -1; j--) {
                System.out.print(mas[i][j] + "    ");
            }
            System.out.println();
        }

    }

}
