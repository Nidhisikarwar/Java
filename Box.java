import java.awt.Dimension;

import javax.swing.JMenu;

class Box{
    double width;
    double height;
    double depth;
    Box(){//default constructor
        width=5;
        height=5;
        depth=5;
    }
    Box(double w,double h,double d){//parameterized constructor
        width=w;
        height=h;
        depth=d;
    }
    Box(Box ob){//clone onstructor
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    Box(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*height*depth;
    }
    public static JMenu createRigidArea(Dimension dimension) {
        return null;
    }
}
class Box1 extends Box{
    double weight;
    Box1(double w,double h,double d,double n){
        super(w,h,d);
        weight=n;
        
    
  }
}
class BoxColor extends Box1{
    String color;
    BoxColor(double w, double h, double d, double n,String c) {
        super(w, h, d, n);
        color=c;
    }
}
class TestBox{
    public static void main(String args[]){
    Box ob1=new Box(10,20,30);
    Box ob2=new Box();
    Box1 ob3=new Box1(50,60,70,80.5);
    Box ob4=new Box(ob3);
    BoxColor ob5= new BoxColor(10,10,10,10,"blue");
   
    System.out.println("Volume of 0b1 is " + ob1.volume());
    System.out.println("Weight of ob3 is " + ob3.weight);
    //ob1.volume();
    System.out.println("Volume of 0b2 is " + ob2.volume());
    //ob2.volume();
    System.out.println("Volume of 0b3 is " + ob3.volume());
   // ob3.volume();
    System.out.println("Volume of 0b4 is " + ob4.volume());
    //ob4.volume();
   
    
    System.out.println("colour of 0b5 is " + ob5.color);
    
}
}