class ThreadClass implements Runnable{
    public void run(){
        System.out.println("inside thread 1");
        for (int i=0;i<5;i++){
            System.out.println("from thread 1 i="+i);
        }
        System.out.println("exit thread 1");
    }
}
class ThreadClass1 implements Runnable{
    public void run(){
    System.out.println("inside thread 2");
    for(int i=0;i<10;i++){
        System.out.println("from thread 2 i="+i);
    }
    System.out.println("exit thread 2");
    }
}
public class ThreadIf{
    public static void main(String args[]){
        ThreadClass c1=new ThreadClass();//creating class 1 object
        ThreadClass1 c2=new ThreadClass1();//creating class 2 object
        Thread t1=new Thread(c1);//creating a thread object and giving reference of class object to thread object.
        Thread t2=new Thread(c2);//creating a thread object and giving reference of class object to thread object.
        t1.start();
        t2.start();
        System.out.println("end of main thread");
    }
}