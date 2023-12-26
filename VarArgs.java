class VarArgs{
static void varTest(int...v){
    System.out.print("number of args:"+v.length+"contents:");
    for(int x:v)
    System.out.print(x+" ");
    System.out.println();
}
public static void main(String args[]){
    varTest(20);//1 arguments
    varTest(1,2,3,4,5,6);//6 arguments
    varTest();//no arguments
}
}