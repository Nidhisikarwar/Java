class MyThread extends Thread{//creating a thread by extending thread class
        public void run(){
            System.out.println("Hi this is process of creating a thread by extending a thread class");
        }
    }
        class MyThread1 extends Thread{
        public void run(){
            System.out.println("hi");
        }
    }
class TestThread{
    public static void main(String args[]){
        MyThread t1=new MyThread();
        t1.start();
        MyThread1 t2 =new MyThread1();
        t2.start();
        try{
            for(int i=1;i<5;i++){
            System.out.println(i);
            Thread.sleep(5000);
        }
    }
    catch(Exception e){
        System.out.println("Interrupt exception"+e);
    }
}}