public class Point {
    Float x;
    Float y;

    public Point(Float _x, Float _y){
        this.x = _x;
        this.y = _y;
    }

    public String toString(){
        return "Point(x=" + this.x + ", y=" + this.y + ")";
    }
}
