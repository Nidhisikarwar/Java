//public and private difference
class Test1{
    int a;//default access
    public int b;
    private int c;
    void setc(int i){//set n value
        c=i;
    }
    int getc(){//get n value
        return c;
    }
}
class Access{
    public static void main(String args[]){
       Test1 ob=new Test1  ();
        ob.a=50;
        ob.b=60;
        ob.setc(20);
        System.out.println("a,b,c:"+ob.a+ " "+ ob.b+" "+ob.getc());
    
    }
}