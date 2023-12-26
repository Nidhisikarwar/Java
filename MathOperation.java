import java.util.Scanner;
class MathOperation{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        double num=s.nextDouble();
        System.out.println("Ceil value:"+ Math.ceil(num));
        System.out.println("Floor value:"+ Math.floor(num));
        System.out.println("Square root:"+ Math.sqrt(num));
        System.out.println("Cube:"+ Math.cbrt(num));
        s.close();
    }
}