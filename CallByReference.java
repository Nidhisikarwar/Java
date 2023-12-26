class CallByReference{
    int a=100;
    void change(CallByReference s){
        s.a=s.a+100; //changes will be in the instance variable
    }
public static void main(String args[]){
    CallByReference s= new CallByReference();
    System.out.println("before change"+ s.a);
    s.change(s);
    System.out.println("after change"+s.a);
}
    
}