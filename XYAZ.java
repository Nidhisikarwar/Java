class XYAZ{
    int a =9;
    public String toString(){
        System.out.println("Class XYAZ printed");
        return "Hi " +a;
    }
}
class testXYAZ{
    public static void main(String[] args){
        XYAZ ob = new XYAZ();
        System.out.println(ob);
    }
}