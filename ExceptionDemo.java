//creating our own exception type
 class MyException extends RuntimeException{
    private int detail;
    MyException(int a){
        detail=a;
    }
    public String toString(){
        return "MyException["+detail+"]";
    }
}
class ExceptionDemo{
    static void compute(int a) throws MyException{
        System.out.println("called compute("+ a +")");
        if(a>10)
        throw new MyException(a);
        System.out.println("normal exit");
    }
    public static void main(String args[]){
        try{
            compute(10);
            compute(20);
        }
        catch(MyException e){
            System.out.println("caught"+e);
        }
    }
}