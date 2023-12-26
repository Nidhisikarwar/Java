class CallByValue1 {
void meth(int i, int j) {
i *= 2;
j /= 2;
}
}
class CallByValue2 {
public static void main(String args[]) {
CallByValue1 ob = new CallByValue1();
int a = 15, b = 20;
System.out.println("a and b before call: " +a + " " + b);
ob.meth(a, b);
System.out.println("a and b after call: " +a + " " + b);

}
}
