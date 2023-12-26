class FinallyDemo{
    static void A(){
        try{
            System.out.println("inside process A");
            throw new RuntimeException("demo");
        }
        finally{
            System.out.println("process A finally");
        }
    }
    static void B(){
        try{
            System.out.println("inside process B");
            return;
        }
        finally{
            System.out.println("process B finally");
        }
    }
    static void C(){
        try{
            System.out.println("inside process C");
            return;
        }
        finally{
            System.out.println("process c finally");
        }
    }
    public static void main(String args[]){
        try{
            A();
            }
            catch(RuntimeException e){
                System.out.println("Exception caught");
            }
            B();
            C();
    }
    }