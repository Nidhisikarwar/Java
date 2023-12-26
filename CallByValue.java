class CallByValue{
    int a=100;
    void change(int a){
        a=a+100; //changes in local variable only
    }
public static void main(String args[]){
    CallByValue s= new CallByValue();
    System.out.println("before change"+ s.a);
    s.change(100);
    System.out.println("after change"+s.a);
}
    
}