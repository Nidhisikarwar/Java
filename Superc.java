class Superc{
    int i;}
    class Subc extends Superc{
    int i;
    Subc(int a,int b){
        super.i=a;
        i=b;
    }
    void show(){
        System.out.println("i in superclass:"+ super.i);
        System.out.println("i in subclass:"+i);
    }
}
class SuperUse{
    public static void main(String args[]){
    Subc ob1=new Subc(10,100);
    ob1.show();
    }
}