class A extends Thread{
    public void run(){
        System.out.println("Thread A");
        for(int i=0;i<5;i++){
            System.out.println("Thread A:i="+i);
        }
        System.out.println("exit from thread A");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("Thread B");
        for(int i=0;i<5;i++){
            System.out.println("Thread B:i="+i);
        }
        System.out.println("exit from thread B");
    }
}
class ExtendThread{
    public static void main(String args[]){
        new A().start();//creating class A thread object and calling run method
        new B().start();//creating class B thread object and calling run method
        System.out.println("End of main thread");
    }
}