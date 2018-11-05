package Task3;

public class Task2 {

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        int count = 9;
        long timeCycle = task2.Cycle(count);
        long timeRecursion = task2.Recursion(count);
        System.out.println("Time work : Name of metod : Number of parametr = " + count);
        if (timeCycle < timeRecursion) {
            System.out.println(timeCycle + ":" + "Cycle");
            System.out.println(timeRecursion +":" + "Recursion");
        } else {
            System.out.println(timeRecursion +":" + "Recursion");
            System.out.println(timeCycle + ":" + "Cycle");
        }
    }

    public long Recursion(int count) {
        long startTime = System.nanoTime();
        if (count == 1 || count == 0) {
            return 1;
        }

        count *= Recursion(count - 1 );
        long estimatedTime = System.nanoTime() - startTime;

        return estimatedTime;
    }

    public long Cycle(int count) {
        long startTime = System.nanoTime();
        int res = 1;

        for (int i = 1; i <= count; i++ ) {
            res *=i;
        }

        long estimatedTime = System.nanoTime() - startTime;

        return estimatedTime;
    }
}
