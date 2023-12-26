import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class WriteFileNew{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fname = sc.nextLine();
        FileWriter fWrite;
        System.out.print("Do you want to overwrite file (yes or no) ? ");
        String mode = sc.next();
        try{
            if(mode.equalsIgnoreCase("no"))
                fWrite = new FileWriter(fname, true);
            else
                fWrite = new FileWriter(fname);
            fWrite.write("Hello! Nidhi Sikarwar \nWelcome to JAVA Programming.\n");
            fWrite.close();
            System.out.println("File wrote successfully.");
        }
        catch(IOException e){
            System.out.println("An unexpected error occured.");
            System.err.println(e);
        }
    }
}