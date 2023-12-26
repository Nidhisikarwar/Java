class A11 extends Thread{
    public void run(){
        System.out.println("Thread A");
        for(int i=0;i<5;i++){
            System.out.println("Thread A:i="+i);
        }
        System.out.println("exit from thread A");
    }
}
class B11 extends Thread{
    public void run(){
        System.out.println("Thread B");
        for(int i=0;i<5;i++){
            System.out.println("Thread B:i="+i);
        }
        System.out.println("exit from thread B");
    }
}
class ExtendThread11{
    public static void main(String args[]){
        A1 t1 =new A1();//creating class A thread object and calling run method
        B1 t2 =new B1();//creating class B thread object and calling run method
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
       // System.out.println("thread 1 priority:"+t1.getPriority());
       // System.out.println("thread 2 priority:"+t2.getPriority());
       
        
         t1.start();
         t2.start();
        System.out.println("End of main thread");
   }
}