//method overriding
class OverRiding{
    String i,j;
    OverRiding(String a,String b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i and j:"+i+""+j);
    }}
class SubClass1 extends OverRiding{
String k;
SubClass1(String a,String b,String c){
    super(a,b);
    k=c;
}
void show(){
    System.out.println("k:"+k);
    }}

class SubClass2 extends SubClass1{
        String l;
        SubClass2(String a,String b,String c,String d){
            super(a,b,c);
            l=d;
        }
        void show(){
            System.out.println("l:"+l);
    }}
class TestOverride{
    public static void main(String args[]){
    SubClass2 ob1=new SubClass2("j","a","v","a");
    ob1.show();
    }
}
