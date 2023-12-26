class MethodOverloading {
void method() {
System.out.println("No parameters");
}
// Overload method for one integer parameter.
void method(int a) {
System.out.println("a: " + a);
}
// Overload method for two integer parameters.
void method(int a, int b) {
System.out.println("a and b: " + a + " " + b);
}
// overload method for a double parameter
double method(double a) {
System.out.println("double a: " + a);
return a*a;
}
}
class Overload {
public static void main(String args[]) {
MethodOverloading ob = new MethodOverloading();
double result;
// call all versions of method()
ob.method();
ob.method(10);
ob.method(10, 10);
result = ob.method(12.245);
System.out.println("Result of ob.method(12.245): " + result);
}
}
