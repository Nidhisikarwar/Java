//accessing implementations through interface references
interface IfCall{
    void call(int a);
}
   
class Client implements IfCall {
    // Implement IfCall interface
    public void call(int a) {
    System.out.println("call a:" + a);
    }
    void call1() {
    System.out.println(" call1 method is is not an interface method");
    }
    }
    
class Client1if implements IfCall {
    // Implement IfCall's interface
    public void call(int a) {
    System.out.println("a doubles:"+(a*a));
    }}
    class TestClientifff{
        public static void main(String args[]) {
        IfCall c;//creating a object reference for interface
        Client1 ob = new  Client1();
        Client c1=new Client();
        c=c1;
        c1.call1();
        c1.call(2);
        c.call(10);
        c = ob; // c now refers to  Client1 object
        c.call(10);
        }
        }