package Task2;

public class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius,int speed, int direction) {
        if (!(direction>=-180 && direction<=180)){
            throw new IllegalArgumentException("Direction must be more than -180 and less than 180");
        }
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = speed * (float)Math.cos(Math.toRadians(direction));
        yDelta = -speed * (float)Math.sin(Math.toRadians(direction));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+=xDelta;
        y+=yDelta;
    }

    public void reflectHorizontal(){
        xDelta*=-1;
    }

    public void reflectVertical(){
        yDelta*=-1;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 19 * result + Float.floatToIntBits(x);
        result = 19 * result + Float.floatToIntBits(y);
        result = 19 * result + radius;
        result = 19 * result + Float.floatToIntBits(xDelta);
        result = 19 * result + Float.floatToIntBits(yDelta);

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Ball ball = (Ball) obj;
        return ball.x == x && ball.y == y && ball.radius == radius &&
                ball.xDelta == xDelta && ball.yDelta == yDelta;
    }

    @Override
    public String toString() {
        return "Ball\t[(" + x +
                "," + y +
                "),radius = "+ radius +
                ",speed=(" + xDelta +
                "," + yDelta +
                ")]";
    }
}