interface StackIf2{
    void push(int item);
    int pop();
}
class FixedStack1 implements StackIf2{
    private int stck[];
    private int tos;//allocate and initialize stack

FixedStack1(int size){
    stck=new int[size];
    tos=-1;
}
public void push(int item){
    if(tos==stck.length){
System.out.println("stack overflow");
    }
    else
    stck[++tos]=item;
}
public int pop(){
    if(tos<0){
        System.out.println("stack underflow");
        return 0;
    }
    else
    return stck[--tos];
}
}


class DynamicStack1 implements StackIf2{
    private int stack[];
    private int tos;
    DynamicStack1(int size){
        stack=new int[size];
        tos=-1;
    }
public void push(int item){
    if(tos==stack.length-1){
        int temp[]=new int[stack.length*2];
        for(int i=0;i<stack.length;i++)
        temp[i]=stack[i];
        stack=temp;
    }
    else
    stack[++tos]=item;
}
public int pop(){
    if(tos<0){
        System.out.println("stack underflow");
        return 0;
    }
    else
    return stack[tos--];

}
}
class TestStackIf2{
    public static void main(String args[]){

        
       /* DynamicStack stack1=new DynamicStack(5);
        DynamicStack stack2=new DynamicStack(10);
        //push some numbers into the stack
        for(int i=0;i<10;i++)
        stack1.push(i);
        for(int i=0;i<20;i++)
        stack2.push(i);
        System.out.println("stack in stack1:");
         for(int i=0;i<10;i++)
        System.out.println(stack1.pop());
         System.out.println("Stack in stack2:");
         for(int i=0;i<20;i++)
         System.out.println(stack2.pop()); */
           StackIf2 mystack; // create an interface reference variable
           DynamicStack1 ds = new DynamicStack1(5);
            FixedStack1 fs = new FixedStack1(8);
            mystack = ds; // load dynamic stack
            // push some numbers onto the stack
            for(int i=0; i<12; i++) mystack.push(i);
            mystack = fs; // load fixed stack
            for(int i=0; i<8; i++) mystack.push(i);
            mystack = ds;
            System.out.println("Values in dynamic stack:");
            for(int i=0; i<12; i++)
            System.out.println(mystack.pop());
            mystack = fs;
            System.out.println("Values in fixed stack:");
            for(int i=0; i<8; i++)
            System.out.println(mystack.pop());
            }
            }
    