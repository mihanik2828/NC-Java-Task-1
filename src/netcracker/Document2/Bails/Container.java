package netcracker.Document2.Bails;

import java.util.Objects;

public class Container {
    private int x1,y1,x2,y2;

    public Container(int x1, int y1,int width,int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1+width;
        this.y2 = y1+height;
    }

    @Override
    public String toString() {
        return "Container[("+this.x1+","+this.y1+"),("+this.x2+','+this.y2+")]";
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getHeight() {
        return x2-x1;
    }

    public int getWidth() {
        return y2-y1;
    }

    public boolean collides(Ball ball)
    {
        return x1<=ball.getX()-ball.getRadius() && x2>= ball.getX()+ ball.getRadius() && y1<=ball.getY()-ball.getRadius() && y2>= ball.getY()+ball.getRadius();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return x1 == container.x1 && y1 == container.y1 && x2 == container.x2 && y2 == container.y2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2);
    }
}
