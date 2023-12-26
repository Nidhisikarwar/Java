//Overloading method
class VarArgs2{
static void varTest2(int...v){
System.out.print("number of args:" +v.length+"Contents:");
for(int x:v)
System.out.print(x+" ");
System.out.println();
}
static void varTest2(String message ,int...v){
System.out.print(message+"" +v.length+"Contents:");
for(int x:v)
System.out.print(x+" ");
System.out.println();
}
static void varTest2(boolean...v){
System.out.print("number of args:" +v.length+"Contents:");
for(boolean x:v)
System.out.print(x+" ");
System.out.println();
}
public static void main(String args[]){
    varTest2("nidhi",5);
    varTest2("sikarwar",5,10,15);
    varTest2("java");
    varTest2(true,true,false,false,true);
    varTest2(1,2,3);
}
}

