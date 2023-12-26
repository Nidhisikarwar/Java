abstract class AbstractParent{
    AbstractParent(){
      //  System.out.println("hello");
    }
   abstract void greet();
   abstract void greet1();
   
}
class Child extends AbstractParent{
    void greet(){
        System.out.println("good morning");
    }
    void greet1(){
        System.out.println("good afternoon");
    }
    }
 abstract class Child1 extends AbstractParent{
   abstract void greet2();

}
class Child2 extends Child1{
    void greet(){
        System.out.println("good morning");
    }
    void greet1(){
        System.out.println("good afternoon");
    }
    void greet2(){
        System.out.println("good evening");
    }
}
class TestAbstract{
    public static void main(String args[]){
        Child c1=new Child();
        c1.greet();
        Child c2=new Child();
        c2.greet1();
        Child2 c3=new Child2();
        c3.greet2();
    }
}