public class Shape {
    int x;
    int y;

    Shape(){
        this(0, 0);
    }

    Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    void setX(int x){
        this.x = x;
    }
    int getX(){
        return this.x;
    }

    void setY(int y){
        this.y = y;
    }
    int getY(){
        return this.y;
    }
}
