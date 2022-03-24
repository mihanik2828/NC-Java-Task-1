package netcracker.Document1.MyPointClass;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY()
    {
        return new int[]{x,y};
    }

    public void setXY(int x1,int y1)
    {
        this.setX(x1);
        this.setY(y1);
    }

    @Override
    public String toString() {
        return "("+x+','+y+')';
    }

    public double distance(int x1,int y1)
    {
        return Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2));
    }

    public double distance(MyPoint p)
    {
        return distance(p.getX(),p.getY());
    }

    public double distance()
    {
        return distance(0,0);
    }
}
