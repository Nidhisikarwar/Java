interface StackIf1{
    void push(int item);
    int pop();
}
class DynamicStack implements StackIf1{
    private int stack[];
    private int tos;
    DynamicStack(int size){
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
class TestStackIf1{
    public static void main(String args[]){

        DynamicStack stack1=new DynamicStack(5);
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
         System.out.println(stack2.pop());
        
    }
}

