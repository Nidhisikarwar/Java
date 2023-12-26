import java.util.Random;
class Exception1
{
    public static void main(String args[]){
        int a=0,b=0,c=0;
        Random r=new Random();
        for(int i=0;i<2;i++){
            try{
                b=r.nextInt();
                System.out.println(b);
                c=r.nextInt();
                System.out.println(c);
                a=10/(b/c);
            }
            catch(ArithmeticException e){
                System.out.println("Division by zero"+e);
                a=0;
            }
            System.out.println("a:"+a);
        }
    }
    }