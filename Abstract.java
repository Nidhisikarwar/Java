 abstract class Abstract{
    abstract void method();
    void method1(){
        System.out.println("School of electronics");
    }
}
class Child extends Abstract{
      void method(){
        System.out.println("this is Davv");
      }
}
class UseAbstract{
    public static void main(String args[]){
        Child obj1=new Child();
        obj1.method();
        obj1.method1();
    }
    }
