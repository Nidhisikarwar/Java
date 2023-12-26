class Person1{
    String name;
    String fathername;
    int age;
    Person1(){
        name="ram";
        fathername="lakshman";
        age=-1;
    }
    Person1(String n,String fn,int a){
        name=n;
        fathername=fn;
        age=a;
    }
    Person1(Person1 ob){
        name=ob.name;
        fathername=ob.fathername;
        age=ob.age;
    }
void display(){
    
    System.out.println("name is:"+name);
    System.out.println("fathers name is:"+fathername);
    System.out.println("age is:"+age);
}}
class Student extends Person1{
    double percentage;
    int rollno;
    String subject;

    Student(){
        super();
        percentage=90.0;
        rollno=16;
        subject="java";
    }
    Student(String n,String fn,int a,double p, int rn, String sub){
        super(n,fn,a);
        percentage=p;
        rollno=rn;
        subject=sub;
    }
    Student(Student ob){
        super(ob);
        percentage=ob.percentage;
        rollno=ob.rollno;
        subject=ob.subject;
    }
    void display(){
    super.display();
    System.out.println("percentage is:"+percentage);
    System.out.println("rollno is:"+rollno);
    System.out.println("subject is:"+subject);
        

    }
    void result(){
    if (percentage>90)
    System.out.println("O");
    else if(percentage>80)
    System.out.println("A");
    else if(percentage>70)
    System.out.println("B");
    else if(percentage>60)
    System.out.println("C");
    else if(percentage<=50)
    System.out.println("Fail");
}
}
class BscStudent1 extends Student{
    int year;
    String duration;
    BscStudent1(){
        super();
        year=2023;
        duration="3years";
    }
    BscStudent1(String n, String fn, int a,double p,int rn,String sub,int y,String dur){
        super(n, fn, a, p, rn, sub);
        year=y;
        duration=dur;
    }
    BscStudent1(BscStudent1 ob){
        super(ob);
        year=ob.year;
        duration=ob.duration;
    }
    void display(){
    super.display();
    System.out.println("year is:"+year);
    System.out.println("duration is is:"+duration);
      
}
}
class Profile1{
    public static void main(String args[]){
    BscStudent1 s1=new BscStudent1("nidhi","om",18,91.00,16,"java",2023,"3years");
    BscStudent1 s2=new BscStudent1("siddhi","vinod",19,50.00,23,"java",2023,"3years");
    BscStudent1 s3=new BscStudent1("neha","puran",19,95.00,15,"java",2023,"3years");
    BscStudent1 s4=new BscStudent1();
    
    System.out.println("constructing student profile:");
    
   

    s1.display();
    s1.result();
    s2.display();
    s2.result();
    s3.display();
    s3.result();
    s4.display();
    s4.result();
    
    }
}