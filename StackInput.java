import java.util.Scanner;
class StackInput {
private int stck[] = new int[10];
private int tos;
// Initialize top-of-stack
StackInput() {
tos = -1;
}
// Push an item onto the stack
void push(int item) {
if(tos==9)
System.out.println("Stack is full.");
else
stck[++tos] = item;
}
// Pop an item from the stack
int pop() {
if(tos < 0) {
System.out.println("Stack underflow.");
return 0; }
else
return stck[tos--];
}}
class TestStack1 {
public static void main(String args[]) {
StackInput mystack1 = new StackInput();
StackInput mystack2 = new StackInput();
// push some numbers onto the stack
Scanner s=new Scanner(System.in);
System.out.println("enter numbers to push in stack1");

for(int i=0; i<10; i++){
int n=s.nextInt();
mystack1.push(n);
}
System.out.println("enter numbers to push in stack2");

for(int i=0; i<10; i++){
int n=s.nextInt();
mystack2.push(n);
}
 //pop those numbers off the stack
System.out.println("Stack in mystack1:");
for(int i=0; i<10; i++)
System.out.print(mystack1.pop());
System.out.println("Stack in mystack2:");
for(int i=0; i<10; i++)
System.out.print(mystack2.pop());
s.close();
}
}