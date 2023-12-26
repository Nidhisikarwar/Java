class ThrowDemo{
    static void demoproc(){
        try{
            throw new NullPointerException("Throw demo");
        }
        catch(NullPointerException e){
            System.out.println("caught inside demoproc");
            throw e;
        }
    }
    public static void main(String args[]){
        try{
            demoproc();
        }
        catch(NullPointerException e){
            System.out.println("Recaught in demoproc"+e);
        }
    }
}