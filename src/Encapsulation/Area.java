package Encapsulation;

import java.io.IOException;

public class Area {
    int length;
    int breadth;

    Area(int length, int breadth)//Can use CONSTRUCTOR as setter too
    {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class TryArea {
    public static void main(String[] args)throws IOException
    {
        Area rectangle = new Area(5, 6);
        rectangle.getArea();
    }
}

