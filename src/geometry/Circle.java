package geometry;

public class Circle extends Shape {
    int radius;

    public Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }

    public Circle(int radius){
        super();
        this.radius = radius;
    }

    public Circle(){
        super();
        this.radius = 0;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return this.radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double Perimetr() {
        return 2 * Math.PI * radius;
    }
}
