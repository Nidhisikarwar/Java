class NestedTry{
    public static void main(String args[]){
        try{
            int a=args.length;//command-line args is present
            int b=30/a;
            System.out.println("a:"+a);
            try{
                if(a==1)
                a=a/(a-a);//division by zero
                if(a>=2){
                int n[]={1};
                n[10]=20;//generate an out-of-bound exception
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound exception"+e);
       
        }
    }
    
        catch(ArithmeticException e){
            System.out.println("divide by zero"+e);
    }
}
}
