package netcracker.Document1.MyTriangleClass;

import netcracker.Document1.MyPointClass.MyPoint;

import java.util.Objects;

public class MyTriangle extends MyPoint {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    static final public double e=0.0001;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        v1=new MyPoint(x1,y1);
        v2=new MyPoint(x2,y2);
        v3=new MyPoint(x3,y3);
    }

    @Override
    public String toString() {
        return "MyTriangle(" + "v1" + '='+ v1.toString() +','
                             + "v2" + '='+ v2.toString() +','
                             + "v3" + '='+ v3.toString() + ")  " ;
    }

    public double getPerimeter()
    {
        return v1.distance(v2)+ v1.distance(v3)+v2.distance(v3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MyTriangle that = (MyTriangle) o;
        return Objects.equals(v1, that.v1) && Objects.equals(v2, that.v2) && Objects.equals(v3, that.v3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), v1, v2, v3);
    }

    public String getType()
    {
        double a=v1.distance(v2);
        double b=v2.distance(v3);
        double c=v1.distance(v3);
        if(Math.abs(a-b)<e && Math.abs(b-c)<e) return "Equilateral"; // не существует такого треугольника, поскольку не существует равностороннего треугольника в целочисленных координатах
        if((int)a==(int)b && (int)b==(int)c && (a==b || b==c || a==c) )
            return "Almost Equilateral and excactly Isosceles"; //Равносторонний, если преобразуем длины сторон в int
        if (a==b || b==c || a==c)
            return "Isosceles";
        return "Scalene";
    }
}
