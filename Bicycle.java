interface Bicycle{
    void speedUp(int increment);
    void applyBrake(int decrement);
}
class HerculesBicycle implements Bicycle{
    int speed=10;//by default final
    public void speedUp(int increment){
        speed=speed+increment;
        System.out.println("new increased speed is:"+speed);
    }
    public void applyBrake(int decrement){
        speed=speed-decrement;
        System.out.println("new speed after brake"+speed);
    }
}
class IfBicycle{
    public static void main(String args[]){
          HerculesBicycle c1=new HerculesBicycle();
          System.out.println("original speed is:"+c1.speed);
          c1.speedUp(10);
          c1.applyBrake(10);
    }
}
 