package Task2;

public class Main {
    public static void main(String[] args) {

        Ball ball = new Ball(5,5,4,3,-5);
        Container square = new Container(0,0,20,100);

        System.out.println(ball);
        System.out.println(square);
        System.out.println("\nBall in container: "+square.collidesWidth(ball));

        ball.move();
        System.out.println("\n"+ball);
        System.out.println("Ball in container: "+square.collidesWidth(ball)+"\n");


        System.out.println("Reflecting X direction");
        ball.reflectHorizontal();

        ball.move();
        System.out.println("\n"+ball);
        System.out.println("Ball in container: "+square.collidesWidth(ball)+"\n");

        double[] mas = new double[]{1.0,23.0,12.0,25.0,11.0};
        MyPolynomial myPolynomial = new MyPolynomial(mas);
        System.out.println(myPolynomial.toString());

    }
}