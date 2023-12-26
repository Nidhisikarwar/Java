import orgshapes.Square;
import orgshapes.Triangle;
import orgshapes.Circle;
class Shape{
  public static void main(String args[]){
    Square s=new Square();
    s.area(10);
    Triangle t=new Triangle();
    t.area(10,5);
    Circle c=new Circle();
    c.display("blue");
}}