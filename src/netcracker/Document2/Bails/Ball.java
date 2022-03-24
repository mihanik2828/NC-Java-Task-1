package netcracker.Document2.Bails;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

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

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.setxDelta((float)(speed*Math.cos(Math.toRadians(direction))));
        this.setyDelta((float)(-speed*Math.sin(Math.toRadians(direction))));
    }

    public void move()
    {
        System.out.println("ball moving");
        x+=xDelta;
        y+=yDelta;
    }

    @Override
    public String toString() {
        return "Ball[("+this.getX()+","+this.getY()+"),speed=("+this.xDelta+','+this.yDelta+")]";
    }

    public void reflectHorizontal()
    {
        xDelta=-xDelta;
        System.out.println("Reflect horizontal ");
    }
    public void reflectVertical()
    {
        yDelta=-yDelta;
        System.out.println("Reflect horizontal ");
    }
}
