package netcracker.Document2.Bails;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println(Math.cos(Math.toRadians(120)));

        Ball ball = new Ball(2,2,1,2,0);
        Container container = new Container(0,0,5,5);
        System.out.println(ball.toString()+" "+container.toString());
        System.out.println("1 Colides: "+container.collides(ball));
        ball.move();
        System.out.println();
        System.out.println(ball.toString());
        System.out.println("2 Colides after move: "+container.collides(ball));
        ball.reflectHorizontal();
        System.out.println(ball.toString());
        ball.reflectVertical();
        System.out.println(ball.toString());

        ball.reflectHorizontal();
        ball.reflectVertical();
        ball.move();
        System.out.println("3 Colides after last move: "+container.collides(ball));
    }
}
