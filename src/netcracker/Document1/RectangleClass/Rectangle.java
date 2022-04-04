package netcracker.Document1.RectangleClass;

import java.util.Objects;

public class Rectangle {
    private float lenght = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float lenght, float width) {
        this.lenght = lenght;
        this.width = width;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea()
    {
        return lenght*width;
    }

    public double getPerimeter()
    {
        return 2*(width+lenght);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.lenght, lenght) == 0 && Float.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenght, width);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "lenght=" + lenght +
                ",width=" + width +
                ']'+' ';
    }
}
