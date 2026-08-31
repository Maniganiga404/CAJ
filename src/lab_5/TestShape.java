package lab_5;

public class TestShape {
    public static void main(String[] args){
        Square s1 = new Square();
        assert(s1.isFilled()==true);
        assert(s1.getColor().equals("red"));

        Square s2 = new Square(6,"red",false);
        assert(s2.isFilled()==false);
        assert(s2.getColor().equals("red"));
        assert(s2.getSide() == 6);
        s2.setColor("blue");
        s2.setFilled(true);
        assert(s2.isFilled()==true);
        assert(s2.getColor().equals("blue"));

        Square s3 = new Square(9);
        s3.setColor("white");
        assert(s3.getColor().equals("white"));
        assert(s3.getLength()==9);



        Circle c1 = new Circle(5);
        assert c1.getRadius() == 5;
        assert c1.getArea() == Math.PI * 5 * 5;
        assert c1.getPerimeter() == 2 * Math.PI * 5;
        c1.setRadius(10);
        assert c1.getRadius() == 10;
        Circle c2 = new Circle(6, "red", false);
        assert c2.getRadius() == 6;
        assert c2.getColor().equals("red");
        assert c2.isFilled() == false;
        c2.setColor("blue");
        c2.setFilled(true);
        assert c2.getColor().equals("blue");
        assert c2.isFilled() == true;


        Rectangle r1 = new Rectangle();
        assert r1.getWidth() == 1.0;
        assert r1.getLength() == 1.0;
        assert r1.getColor().equals("red");
        assert r1.isFilled() == true;
        Rectangle r2 = new Rectangle(5, 10);
        assert r2.getWidth() == 5;
        assert r2.getLength() == 10;
        assert r2.getArea() == 50;
        assert r2.getPerimeter() == 30;
        r2.setWidth(6);
        r2.setLength(12);
        assert r2.getWidth() == 6;
        assert r2.getLength() == 12;
        assert r2.getArea() == 72;
        assert r2.getPerimeter() == 36;
        Rectangle r3 = new Rectangle(4, 8, "blue", false);
        assert r3.getWidth() == 4;
        assert r3.getLength() == 8;
        assert r3.getColor().equals("blue");
        assert r3.isFilled() == false;
        r3.setColor("green"); r3.setFilled(true);
        assert r3.getColor().equals("green");
        assert r3.isFilled() == true;
        System.out.println(r3.toString()); System.out.println("All Rectangle tests passed!");
    }
}
