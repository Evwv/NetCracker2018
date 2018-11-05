package Task3;

public class Task3 {

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        int size = 5;
        task3.drawingRectangle(size);
        System.out.println();
        task3.drawingFigures(size);
        System.out.println();
        task3.drawingFigures2(size);
        System.out.println();
        task3.drawingFigures3(size);
    }

    public void drawingRectangle(int count) {
        for (int row = 1; row <= count; row++) {
            for (int col = 1; col <= count; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void drawingFigures(int count) {
        for (int row = 1; row <= count; row++) {
            for (int col = 1; col <= count; col++) {
                if ( row <= col){
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public void drawingFigures2(int count) {
        for (int row = 1; row <= count; row++) {
            for (int col = 1; col <= count; col++) {
                if ( row >= col){
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public void drawingFigures3(int count) {
        for (int row = 1; row <= count; row++) {
            for (int col = 1; col <= count; col++) {
                if ( row  == 1 || row == count){
                    System.out.print("#");
                } else if ( col == 1 || col == count) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



}
