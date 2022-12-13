public class Circle {
    private double radius;
    private String color;

    Circle(){

    };

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getDiameter(){
        return this.radius * 2 * Math.PI;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public String toString(){
        return "A Circle with radius= " + getRadius();
    }
}

class Cylinder extends Circle {
    private double height;
    Cylinder(){
    };

    Cylinder(double height){
        this.height = height;
    }


    Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }


    public double getHeight(){
        return this.height;
    }

    public void setHeight(double radius){
        this.height = height;
    }

    public double getArea(){
        return getRadius() * getRadius() * Math.PI * this.height;
    }

    @Override
    public String toString(){
       return "A Cylinder with radius= " + getArea();
    };
}
