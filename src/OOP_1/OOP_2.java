package OOP_1;
class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter (){
        return (length * width) * 2;
    }
}
public class OOP_2 {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(15,20);
        System.out.println(rc.getArea());
        System.out.println(rc.getPerimeter());
    }
}
