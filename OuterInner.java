import java.util.Scanner;
class OuterInner{
    int outervalue;
   
    void test(int outervalue){
        for( int i=0;i<5;i++){
            class Inner{
                void display(){
                    System.out.println("value of outer is:"+outervalue);
                }
            }
            Inner innervalue=new Inner();
            innervalue.display();
            }
        }
    
    }
    class InnerClass{
        public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            System.out.println("enter the value");
            int outervalue=s.nextInt();
            
            OuterInner o=new OuterInner();
            o.test(outervalue); 
            s.close();      
        }
        }
    