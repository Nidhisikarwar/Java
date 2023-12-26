import java.util.Scanner;

class FactRecursion {
int fact(int n) {
int result;
if(n==1) return 1;
result = fact(n-1) * n;
return result;
}
}
class Recursion {
public static void main(String args[]) {
 //FactRecursion f = new FactRecursion();
Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    FactRecursion f= new FactRecursion();
    s.close();
    System.out.println("factorial of n is:"+ f.fact(n));
    //System.out.println("Factorial of 10 is " + f.fact(10));
    //System.out.println("Factorial of 5 is " + f.fact(5));
    //System.out.println("Factorial of 6 is " + f.fact(6));
}
}
