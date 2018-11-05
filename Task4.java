package Task3;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Task4 task44 = new Task4();
        System.out.println("task4a");
        task44.task4a(50);
        System.out.println("task4b");
        task44.task4b(20);
        System.out.println("task4c");
        task44.task4c(30);
        System.out.println("task4d");
        task44.task4d(15);
        System.out.println("task4e");
        task44.task4e(10);
        System.out.println("task4f");
        task44.task4f(20);

    }

    public void task4a(int count) {
        int[] mas = new int[count];
        int j =0;

        for (int i = 1; i <= 99; i+=2) {
            mas[j] = i;
            j++;
        }

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

        for (int i = 0; i < mas.length; i ++) {
            System.out.print(mas[i] + " ");
        }

        System.out.println();
        System.out.println();

        for (int c = mas.length -1 ; c >=0; c --) {
            System.out.print(mas[c] + " ");
        }
        System.out.println();
    }

    public void task4b(int count) {
        int[] mas = new int[count];

        for (int i = 0; i < count; i++) {
            mas[i] = (int)(Math.random()*11);
        }

        for (int i = 0; i < count; i++) {
            System.out.print(mas[i] + " ");
        }

        int even = 0,notEven = 0;

        for (int i : mas) {
            if (i % 2 == 0) {
                even++;
            }else {
                notEven++;
            }
        }

        System.out.println();
        System.out.println("Number of even : " + even);
        System.out.println("Number of notEven : " + notEven);
    }

    public void task4c(int count) {
        int[] mas = new int[count];

        for (int i = 0; i < count; i++) {
            mas[i] = (int) (Math.random() * 101) - 1;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("After change");
        for (int i = 0; i < count; i++) {
            if (i % 2 != 0) {
                mas[i] = 0;
            }
            System.out.print(mas[i] + " ");
        }

        System.out.println();
    }

    public void task4d(int count) {
        int[] mas = new int[count];

        for (int i = 0; i < count; i++) {
            mas[i] = (int)(Math.random()*(101)) - 50;
            System.out.print(mas[i] + " ");
        }

        int max = mas[0],min = 0;
        int entryMax = 0,entryMin = 0;

        for (int i : mas) {
            if (i > max) {
                max = i;
            } else if ( i < min) {
                min = i;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == max) {
                entryMax = i;
            } else if (mas[i] == min) {
                entryMin = i;
            }
        }

        System.out.println();
        System.out.println("Max = " + max + " LastIndexMax = " + entryMax);
        System.out.println("Min = " + min + " LastIndexMin = " + entryMin);
    }

    public void task4e(int count) {
        int[] mas = new int[count];
        int[] mas2 = new int[count];

        for (int i = 0; i < count; i++) {
            mas[i] = (int)(Math.random()*11);
        }
        for (int i = 0; i < count; i++) {
            mas2[i] = (int)(Math.random()*11);
        }

        int count1= 1;
        int number1 = 0;

        for (int i : mas) {
            number1+=i;
            count1++;
        }

        int count2= 1;
        int number2 = 0;

        for (int i : mas2) {
            number2+=i;
            count2++;
        }

        double avg1 = number1/count1;
        double avg2 = number2/count2;

        if (avg1 > avg2) {
            System.out.println("Average  = " + avg1 + " for array 1 is bigger");
        } else if (avg2 > avg1) {
            System.out.println("Average  = " + avg2 + " for array 2 is bigger");
        } else {
            System.out.println("Average for array 1 == Average for array 2");
        }

    }

    public void task4f(int count) {
        int[] mas = new int[count];

        for (int i = 0; i < count; i ++) {
            mas[i] = (int)(Math.random()*3)-1;
            System.out.print(mas[i] + "  ");
        }

        int number1 = 0,number0 = 0,numberMinus1 = 0;

        for (int i : mas) {
            if (i == 1) {
                number1++;
            } else if (i == 0) {
                number0++;
            } else {
                numberMinus1++;
            }
        }

        System.out.println();
        int[] massiv = new int[]{number1,number0,numberMinus1};
        int flag1 = 0,flag0 = 0, flagMinus1 = 0;
        Arrays.sort(massiv);


        for (int i : massiv) {
            if (i == number1 && number1 == massiv[2] && flag1 == 0) {
                System.out.println(" 1 is more common");
                flag1 = 1;
            } else if (i == number0 && number0 == massiv[2] && flag0 == 0 ) {
                System.out.println(" 0 is more common");
                flag0 = 1;
            } else if (i == numberMinus1 && numberMinus1 == massiv[2] && flagMinus1 == 0) {
                System.out.println(" -1 is more common");
                flagMinus1 = 1;
            }
        }
    }
}
