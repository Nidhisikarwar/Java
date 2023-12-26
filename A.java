//class hierarchy 
class Hier{
       Hier(){
        System.out.println("hi");
    }
}
class A extends Hier{
    A(){
        System.out.println("this is java");
    }
}
class B extends A{
    B(){
    System.out.println("programming");
}
}
class C extends B{
    C(){
    System.out.println("SOEX");
}
}
class CallingConstructor{
    public static void main(String args[]){
        C obj=new C();
    }
}