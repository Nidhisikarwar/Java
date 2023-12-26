interface StackIf{
    void push(int item);
    int pop();
}
class FixedStack implements StackIf{
    private int stck[];
    private int tos;//allocate and initialize stack

FixedStack(int size){
    stck=new int[size];
    tos=-1;
}
public void push(int item){
    if(tos==stck.length-1)
    System.out.println("Stack is full");
    else
    stck[++tos]=item;
}
public int pop(){
    if(tos<0){
        System.out.println("Stack underflow");
        return 0;
    }
    else
    return stck[tos--];
}
}
class TestStackIf{
    public static void main(String args[]){

        FixedStack stack1=new FixedStack(5);
        FixedStack stack2=new FixedStack(10);
        //push some numbers into the stack
        for(int i=0;i<5;i++)
        stack1.push(i);
        for(int i=0;i<10;i++)
        stack2.push(i);
        System.out.println("stack in stack1:");
         for(int i=0;i<5;i++)
        System.out.println(stack1.pop());
         System.out.println("Stack in stack2:");
         for(int i=0;i<10;i++)
         System.out.println(stack2.pop());
        
    }
}

