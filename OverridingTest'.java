//method overriding
class OverRidingTest{
    String i,j;
    OverRidingTest(String a,String b){
        i=a;  
        j=b;
    }
    void show(){
        System.out.println("i and j:"+i+""+j);
    }}
class SubClass1 extends OverRidingTest{
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
class TestOverRide1{
    public static void main(String args[]){
    OverRidingTest ob1=new OverRidingTest("j","a");
    ob1.show();
    SubClass1 ob2=new SubClass1("j","a","v");
    ob2.show();
    SubClass2 ob3=new SubClass2("j","a","v","a");
    ob3.show();
   

    }
}
