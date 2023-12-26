package pack1;
class Bank{
    String name;
    double balance;
    double deposit;
    Bank(String n,double b,double d){
    name=n;
    balance=b;
    deposit=d;
}
void showBank(){
    if(balance<0)
    System.out.print("");
    System.out.print(name+":"+balance +"deposit:"+deposit);
}
}
class TestBank{
    public static void main(String args[]){
        Bank employee[]=new Bank[2];
      employee[0]=new Bank("nidhi sikarwar",10000,5000);
      employee[1]=new Bank("siddhi arjariya",5000,2000);
      for(int i=0;i<2;i++)
      employee[i].showBank();
    }
}