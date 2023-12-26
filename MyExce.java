//creating our own exception type
 class MyException2 extends Exception{
    private int detail;
    MyException2(int a){
        detail=a;
    }
    public String toString(){
        return "MyException1["+detail+"]";
    }
}
class ExceptionDemo2{
    static void compute(int a) throws MyException2{
        System.out.println("called compute("+ a +")");
        if(a>10)
        throw new MyException2(a);
        System.out.println("normal exit");
    }
    public static void main(String args[]){
        try{
            compute(10);
            compute(20);
        }
        catch(MyException2 e){
            System.out.println("caught"+e);
        }
    }
}