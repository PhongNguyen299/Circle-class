public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.3,"blue");
        Cylinder cylinder = new Cylinder(4.3,"red",5);
        circle.getArea();
        cylinder.getArea();
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}