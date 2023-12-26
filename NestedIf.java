//nested interfaces example 
class Parent{
 public interface NestedIf{//here nested interface is present
    void print(int a);
   }
}
class ChildA implements Parent.NestedIf{//accessing nested interface by specifying class name
     public void print(int a){
        System.out.println("a is:"+a);
    }
}
class TestNestedIf{
    public static void main(String args[]){
    Parent.NestedIf ob1=new ChildA();//using nested interface reference
    
    ob1.print(10);
    }
}

