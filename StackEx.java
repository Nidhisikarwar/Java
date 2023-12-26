class StackEx{
    int stk[]=new int[10];
    int tos;
     StackEx(){
        tos=-1;
    }
    void push(int item){
        if(tos==9){
            System.out.println("Stack is full");
        }
        else
        stk[++tos]=item;
    }
    int pop(){
        if(tos<0){
            System.out.println("Stack is empty");
            return 0;
        }
        else
        return stk[tos--];
    }
}
class UseStack{
    public static void main(String args[]){
            StackEx s1=new StackEx();
            StackEx s2=new StackEx();
            System.out.println("enter elements to push");
            for(int i=0;i<10;i++)
            s1.push(i);
            for(int i=0;i<10;i++)
            s2.push(i);
            System.out.println("elements in stack1:");
            for( int i=0;i<10;i++)
            System.out.println(s1.pop());
            System.out.println("elements in stack2:");
            for( int i=0;i<10;i++)
            System.out.println(s2.pop());
    
    }
}
