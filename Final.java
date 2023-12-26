class Final{
    void meth1(){
        System.out.println("java programming");
    }
    final void meth2(){
        System.out.println(" Hi this Nidhi Sikarwar");
    }
    }
class Final1 extends Final{
    void  meth1(){
        System.out.println("SOEX");
    }
}
class Finalc{
    public static void main(String args[]){
        Final ob1=new Final();
        Final1 ob2=new Final1();
        ob1.meth1();
        ob2.meth1();
        ob2.meth2();
    }
}