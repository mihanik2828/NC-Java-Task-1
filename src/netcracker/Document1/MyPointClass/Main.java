package netcracker.Document1.MyPointClass;

public class Main {
    public static void main(String[] args) {
        MyPoint myPoint=new MyPoint(4,4);
        System.out.println(myPoint.distance());
        System.out.println(myPoint.distance(new MyPoint(1,1)));
        System.out.println(myPoint.distance(5,5));
        myPoint.setXY(3,3);
        System.out.println(myPoint.toString());
    }
}
