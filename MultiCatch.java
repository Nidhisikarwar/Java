class MultiCatch{
    public static void main(String args[]){
        try{
            int a=args.length;
            System.out.println("a="+a);
            int b=30/a;
            int c[]={10};
            c[20]=50;
        }
        catch(ArithmeticException e){
            System.out.println("divide by zero:"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds:"+e);
        }
        System.out.println("after try/catch blocks");
    }
}