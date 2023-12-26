import java.util.Scanner;
class Student_Callref{
    int enrol, age, batch;
    String name, fname, gen, course, email;
    Long contact;

    Student_Callref(int enrol, String name, String fname, String gen, int age, String course,int batch, String email, Long contact){
        this.enrol = enrol;
        this.name = name;
        this.fname = fname;
        this.gen = gen;
        this.age = age;
        this.course = course;
        this.batch = batch;
        this.email = email;
        this.contact = contact;
    }
    Student_Callref(Student_Callref CR){
        this.name = CR.name;
        this.gen = CR.gen;
        this.email = CR.email;
        this.contact = CR.contact;
    }
    void displayCR(){
        System.out.print(name+"\t"+gen+"\t"+email+"\t"+contact);
    }
    void display(){
        System.out.print(enrol+"\t"+name+"\t"+fname+"\t"+gen+"\t"+age+"\t"+course+"\t"+batch+"\t"+email+"\t"+contact);
    }
}
class Call_Reference{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details: Enrol_No., Name, Father_Name, Gender, Age, Course, Batch, Email, Contact_No");
        Student_Callref obj1 = new Student_Callref(sc.nextInt(), sc.nextLine(),sc.nextLine(),sc.next(),sc.nextInt(),sc.next(), sc.nextInt(), sc.next(), sc.nextLong());
        Student_Callref obj2 = new Student_Callref(obj1);
        System.out.println("Enrollment_No.\tStudent_Name\tFather_Name\tGender\tAge\tCourse\tBatch\tEmail\tContact_No.");
        obj1.display();
        System.out.println("CR Details: ");
        obj2.displayCR();
    }
}