public class Main_Thread{
    public static void main(String args[]){
        Thread t=Thread.currentThread();
        Thread t1= new Thread();
        System.out.println("Current thread:"+t);
        //changing the name of the thread
        t.setName("Thread example");
        System.out.println("after name changes:"+t);
        System.out.println(t1);
        try{
            for(int i=0;i<5;i++){
                System.out.println(i);//print number with interval of 1 sec.
                Thread.sleep(2000);//thread is going to sleep for 1 sec.
            }
        }
        catch(Exception e){
            System.out.println("main thread interrupted");
        }
    }
}