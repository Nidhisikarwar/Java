class Superclass{
    int i,j;
    void showij(){//display i and j
    System.out.println("i and j:" +i+" "+j);
}
}
class Subclass extends Superclass{
    int k;
    void showk(){//display k
        System.out.println("k:"+k);
    }
    void sum(){
        System.out.println("sum:"+(i+j+k));
    }
}
class Inheritance{
    public static void main(String args[]){
        Superclass ob1=new Superclass();
        Superclass ob2=new Superclass();
        Subclass ob3=new Subclass();//subclass can access all the members of its superclass
        Subclass ob4=new Subclass();
        ob1.i=20;
        ob1.j=30;
        ob2.i=50;
        ob2.j=80;
        System.out.println("ob1 show i and j:");
        ob1.showij();
        System.out.println("ob2 show i and j:");
        ob2.showij();
        ob3.i=2;
        ob3.j=4;
        ob3.k=6;
        ob4.i=10;
        ob4.j=20;
        ob4.k=30;
        System.out.print("ob3 show i,j and k:");
        ob3.showij();
        ob3.showk();
        System.out.print("ob4 show i,j and k:");
        ob4.showij();
        ob4.showk();
        System.out.println("sum of i,j and k of ob3:");
        ob3.sum();
        System.out.println("sum of i,j and k of ob4:");
        ob4.sum();
    }
}