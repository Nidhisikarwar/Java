class ThreadA extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++)
            System.out.println("Thread A : " + (i+1));
        System.out.println("\t---Exit thread A---");
    }
}
class ThreadB extends Thread{
    public void run(){
        System.out.println("Thread B priority: " + getPriority());
        for(int i = 0; i < 5; i++)
            System.out.println("Thread B : " + (i+91));
        System.out.println("\t---Exit thread B---");
    }
}class ThreadC extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++)
            System.out.println("Thread C : " + (char)(i+65));
        System.out.println("\t---Exit thread C---");
    }
}
class ThreadPriority{
    public static void main(String[] args){
        ThreadA a = new ThreadA();
        a.setPriority(Thread.MIN_PRIORITY);
        ThreadB b = new ThreadB();
        b.setPriority(Thread.NORM_PRIORITY);
        ThreadC c = new ThreadC();
        c.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();
        c.start();
        System.out.println("exit of main thread");
    }
}