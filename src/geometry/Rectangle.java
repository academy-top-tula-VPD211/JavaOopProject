package geometry;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(){
        this(0, 0);
    }

    public Rectangle(int width, int height){
        this(0, 0, width, height);
    }

    public Rectangle(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return this.width;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }

    @Override
    public double Area(){
        return width * height;
    }

    @Override
    public double Perimetr() {
        return 2 *(width + height);
    }
}
