class ExceptionNew{
    public static void main(String args[]){
        int a,d;    
        try{
    
a=0;
d=30/a;
System.out.println("this will not be printed");
        }
        catch(ArithmeticException error){
            System.out.println("divide by zero") ;
        }
    }
}