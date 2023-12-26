class MyThreadNew extends Thread{//creating a thread by extending thread class
        public void run(){
            System.out.println("Hi this is process of creating a thread by extending a thread class");
        }
    }
        class MyThreadNew1 extends Thread{
        public void run(){
            System.out.println("hi");
        }
    }
class TestThread1{
    public static void main(String args[]){
        new MyThread().start();
        //t1.start();
        new MyThread1().start();
        //t2.start();
        try{
            for(int i=1;i<5;i++){
            System.out.println(i);
            Thread.sleep(500);
        }
    }
    catch(Exception e){
        System.out.println("Interrupt exception"+e);
    }
}}