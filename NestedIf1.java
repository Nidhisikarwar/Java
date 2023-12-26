import java.util.Scanner;
class A1 {
// this is a nested interface
public interface NestedIF {
boolean isNotNegative(int x);
}
}
// B implements the nested interface.
class B1 implements A1.NestedIF {
public boolean isNotNegative(int x) {
return x < 0 ? false : true;
}
}
class TestNestedIf1 {
public static void main(String args[]) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a number: ");
    int x=sc.nextInt();
// use a nested interface reference
A1.NestedIF nif = new B1();
if(nif.isNotNegative(x))
System.out.println(" it is not negative");
else
System.out.println("it is negative");
sc.close();
}
}