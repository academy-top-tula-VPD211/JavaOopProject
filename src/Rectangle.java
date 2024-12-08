public class Rectangle extends Shape {
    int width;
    int height;

    Rectangle(){
        this(0, 0);
    }

    Rectangle(int width, int height){
        this(0, 0, width, height);
    }

    Rectangle(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    void setWidth(int width){
        this.width = width;
    }
    int getWidth(){
        return this.width;
    }

    void setHeight(int height){
        this.height = height;
    }
    int getHeight(){
        return this.height;
    }
}
