abstract class AbstractFigure{//abstract class
double side1;
double side2;
AbstractFigure(double s1,double s2){
    side1=s1;
    side2=s2;
}
abstract double area();//abstract method
}
class Square extends AbstractFigure{
    Square(double s1,double s2){
    super(s1,s2);
    }
    double area(){
        System.out.println("area of square:");
        return side1*side2;
    }
}
class Rectangle extends Square{
    Rectangle(double s1,double s2){
        super(s1,s2);
    }
    double area(){
        System.out.println("Area of rectangle:");
        return side1*side2;
    }
}
class Triangle extends Rectangle{
    Triangle(double s1,double s2){
        super(s1,s2);
    }
    double area(){
        System.out.println("Area of triangle:");
        return side1*side2/2;
    }
}
class Areas1{
    public static void main(String args[]){
        Square s=new Square(4,4);
        Rectangle r=new Rectangle(5,5);
        Triangle t=new Triangle(10,10);

        AbstractFigure figref;
      //  figref=f;
        //System.out.println("area is:"+figref.area());
        figref=s;
        System.out.println("area is:"+figref.area());
        figref=t;
        System.out.println("area is:"+figref.area());
        figref=r;
        System.out.println("area is:"+figref.area());
    }
}