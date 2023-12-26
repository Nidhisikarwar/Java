class DynamicMethodDispatch{
    void call(){
        System.out.println("hi");
    }
}
class A extends DynamicMethodDispatch{
    void call(){
        System.out.println("this is dynamic method dispatch");
    }
}
class B extends A{
    void call(){
        System.out.println("using it by superclass reference variable");
    }
}
class UseDmd{
public static void main(String args[]){
DynamicMethodDispatch ob1=new DynamicMethodDispatch();//object of first class
A ob2=new A();//object of class A
B ob3=new B();//object of class B

DynamicMethodDispatch ref; //creating superclass reference variable

ref=ob1;//refers to a first class object
System.out.println(" first class calling method:");
ref.call();
ref=ob2;//refers to a A object
System.out.println(" second class calling method:");
ref.call();
ref=ob3;//refers to a B object
System.out.println(" third class calling method:");
ref.call();
}
}