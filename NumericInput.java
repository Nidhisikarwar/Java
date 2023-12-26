import java.util.Scanner;
//import java.io.*;//access system.out
public class NumericInput{
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int integer;
    long longInteger;
    Float realNumber;
    double doubleReal;
    String s1;
    String s2;
    System.out.println("enter an integer,long integer,real number,another real number,and a strings");
    integer=s.nextInt();
    longInteger=s.nextLong();
    realNumber=s.nextFloat();
    doubleReal=s.nextDouble();
    System.out.println("enter string 1");
    s1=s.next();
    System.out.println("enter string 2");
    s2=s.next();
    System.out.println(integer+" "+longInteger+" "+realNumber+" "+s1+" "+doubleReal+" " +s2);
    s.close();
}
}
