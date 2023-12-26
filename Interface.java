interface Ugc{
void affiliation();
void nep();
}

interface Aicte{
    void scholarship();
}
abstract class Davv{
    void enrollment(){
        System.out.println("enrollment by davv");
    }
    abstract String result(int n);
}
class Soex extends Davv implements Aicte,Ugc{
    String result(int n){
        if (n>50)
        return "pass";
        else 
        return "fail";
    }
    public void affiliation(){
        System.out.println("you got Ugc approval");
    }
    public void nep(){
        System.out.println("New education policy has been improved");
    }
    public void scholarship(){
        System.out.println("Congrats for the scholarship");
    }
}
class UseSoex{
    public static void main(String args[]){
        Soex ob1 =new Soex();
        System.out.println("your result are:"+ob1.result(90));
        ob1.scholarship();
        ob1.nep();
        ob1.affiliation();
    }
}