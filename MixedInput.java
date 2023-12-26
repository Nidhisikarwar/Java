import java.io.*;
import java.util.Scanner;
class MixedTypeInput
{
public static void main(String[] args)
{
double number;
Scanner in = new Scanner(System.in);
System.out.println("Enter your gross income: ");
if (in.hasNextInt())
{
number = (double)in.nextInt();
System.out.println("You entered " + number);
}
else if (in.hasNextFloat())
{
number = (double)in.nextFloat();
System.out.println("You entered " + number);
}
else if (in.hasNextDouble())
{
number = in.nextDouble();
System.out.println("You entered " + number);
}
else
System.out.println("Token not an integer or a real value.");
}
}
