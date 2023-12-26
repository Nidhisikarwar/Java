class VarArgs1{
static void varTest1(String message, int...v){
System.out.print(message+"" +v.length+"Contents:");
for(int x:v)
System.out.print(x+" ");
System.out.println();
}
public static void main(String args[]){
    varTest1("nidhi",5);
    varTest1("sikarwar",5,10,15);
    varTest1("java");
}
}