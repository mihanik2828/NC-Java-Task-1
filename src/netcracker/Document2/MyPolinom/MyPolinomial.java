package netcracker.Document2.MyPolinom;

public class MyPolinomial {
    private double coeffs[];

    public MyPolinomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree()
    {
        return coeffs.length-1;
    }

    @Override
    public String toString()
    {
        if (coeffs==null) return "";
        String s=coeffs[0]+"*x^"+this.getDegree();
        for(int i=1; i<coeffs.length-1;i++)
        {
            if (i==coeffs.length-2)  s+=" + "+coeffs[coeffs.length-2]+"*x";
            else s+=" + "+coeffs[i]+"*x^"+(this.getDegree()-i);
        }
        //s+=" + "+coeffs[coeffs.length-2]+"*x";
        s+=" + "+coeffs[coeffs.length-1];
        return s;
    }


    public MyPolinomial add(MyPolinomial right) {
        MyPolinomial a = this.getDegree() < right.getDegree() ? right : this;
        MyPolinomial b = a == right ? this : right;
        double[] resCoef = a.coeffs.clone();
        MyPolinomial c =new MyPolinomial(resCoef);
        for (int i = 0;i<b.getDegree()+1;i++)
        {
            c.coeffs[a.coeffs.length-i-1]+=b.coeffs[b.coeffs.length-i-1];
        }
        return c;
    }


    public MyPolinomial multiple(MyPolinomial right)
    {
        double c[] = new double[right.getDegree()+this.getDegree()+1];
        for(int i=0;i<c.length;i++) c[i]=0;
        for(int i=this.getDegree();i>=0;i--)
            for(int j=right.getDegree();j>=0;j--)
            {
                c[i+j]+=this.coeffs[i]*right.coeffs[j];
            }
        return new MyPolinomial(c);
    }
}
