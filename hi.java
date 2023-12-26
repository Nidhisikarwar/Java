class Outer{
    int a=1000;
    void test(){
        for(int i=0;i<10;i++){
            class Inner{
                void display(){
                    System.out.println("a:"+a);
                }
            }
    
    
        Inner i1=new Inner();
        i1.display();
    }}}

class InnerDemo{
    public static void main(String args[]){
        Outer o1=new Outer();
        o1.test();
    }
}