package Task3;

public class Task6 {
    Name name;

    public static void main(String[] args) {
        Task6 task6 = new Task6(Name.Igor);
        task6.task6a();
        System.out.println();
        task6.task6b();
    }

    public Task6( Name name) {
        this.name = name;
    }

    public void task6a() {

        long startTime = System.nanoTime();
        switch (name) {
            case Evgeny:
                System.out.println();
                break;
            case Artem:
                System.out.println();
                break;
            case Pavel:
                System.out.println();
                break;
            case Igor:
                System.out.println();
                break;
            case Misha:
                System.out.println();
                break;
        }
        long endTime = System.nanoTime() - startTime;

        long startTime2 = System.nanoTime();

        if (name.equals(Name.Evgeny)) {
            System.out.println();
        } else if (name.equals(Name.Artem)) {
            System.out.println();
        } else if (name.equals(Name.Pavel)) {
            System.out.println();
        } else if (name.equals(Name.Igor)) {
            System.out.println();
        } else if (name.equals(Name.Misha)) {
            System.out.println();
        }

        long endTime2 = System.nanoTime() - startTime2;

        System.out.println("Quickest working time : Name of design");

        if (endTime < endTime2) {
            System.out.println(endTime + ": Switch-case");
        } else {
            System.out.println(endTime2 + ": Else-if");
        }
    }

    public void task6b() {
        int size = 50;
        int[] mas = new int[size];
        int[] masCount = new int[11];

        for (int i = 0; i < size; i++) {
            mas[i] = (int) (Math.random() * 11);
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            switch (mas[i]) {
                case 0:
                    masCount[0]++;
                    break;
                case 1:
                    masCount[1]++;
                    break;
                case 2:
                    masCount[2]++;
                    break;
                case 3:
                    masCount[3]++;
                    break;
                case 4:
                    masCount[4]++;
                    break;
                case 5:
                    masCount[5]++;
                    break;
                case 6:
                    masCount[6]++;
                    break;
                case 7:
                    masCount[7]++;
                    break;
                case 8:
                    masCount[8]++;
                    break;
                case 9:
                    masCount[9]++;
                    break;
                case 10:
                    masCount[10]++;
                    break;
            }
        }

        long endTime = System.nanoTime() - startTime;

        long startTime2 = System.nanoTime();
        for (int i = 0; i < size; i++) {
            if (mas[i] == 0) {
                masCount[0]++;
            } else if (mas[i] == 1) {
                masCount[1]++;
            } else if (mas[i] == 2) {
                masCount[2]++;
            } else if (mas[i] == 3) {
                masCount[3]++;
            } else if (mas[i] == 4) {
                masCount[4]++;
            } else if (mas[i] == 5) {
                masCount[5]++;
            } else if (mas[i] == 6) {
                masCount[6]++;
            } else if (mas[i] == 7) {
                masCount[7]++;
            } else if (mas[i] == 8) {
                masCount[8]++;
            } else if (mas[i] == 9) {
                masCount[9]++;
            } else if (mas[i] == 10) {
                masCount[10]++;
            }
        }

        long endTime2 = System.nanoTime() - startTime2;

        System.out.println("Quickest working time : Name of design");

        if (endTime < endTime2) {
            System.out.println(endTime + ": Switch-case");
        } else {
            System.out.println(endTime2 + ": Else-if");
        }

        System.out.println();

        for (int i = 0; i < masCount.length; i++) {
            System.out.println("Ветка числа " + i + " отработала " + masCount[i] / 2 + " раз");
        }

    }


}
