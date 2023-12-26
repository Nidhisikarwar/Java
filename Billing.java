import java.util.Scanner;
class Billing{
    static void strike(){
        for(int i=0;i<35;i++)
        System.out.print("--");
    }
    static void display(double total){
        System.out.println("Total retail price :"+total);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double p1 =99.90;
        double p2 =20.20;
        double p3 =6.87;
        double p4 =45.50;
        double p5 =40.49;
        double total =0;
        int choice, qty =0;
        while(true){
            System.out.println("Product 1: Rs 99.90");
            System.out.println("Product 2: Rs 20.20");
            System.out.println("Product 3: Rs 6.87");
            System.out.println("Product 4: Rs 45.50");
            System.out.println("Product 5: Rs 40.49");
            System.out.println("Press 6 to exit.");

            System.out.print("Enter product number:");
            choice = sc.nextInt();
            if(choice !=6){
                System.out.print("Enter product quantity:");
                qty=sc.nextInt();
            }
            switch(choice){
                case 1:
                total += 99.90*qty;
                break;
                case 2:
                total += 20.20*qty;
                break;
                case 3:
                total += 6.87*qty;
                break;
                case 4:
                total += 45.50*qty;
                break;
                case 5:
                total += 40.49*qty;
                break;
                case 6:
                System.exit(0);
                break;
                default :
                System.out.println("Invalid choice!");
            }
            strike();
            display(total);
        }
    }
}