package geometry;

public abstract class Shape implements ICalculatable {
    protected int x;
    protected int y;

    public Shape(){
        this(0, 0);
    }

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return this.x;
    }

    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return this.y;
    }
}
