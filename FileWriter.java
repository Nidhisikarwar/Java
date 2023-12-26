import java.io.FileWriter;//importing the file writer class
import java.io.IOException;//importing the IO exception
class WritingFile{
    public static void main(String args[]){
        try{
            FileWriter f1=new FileWriter("myfile.txt");
            f1.write("Hi this is my first file named myfile");
            f1.close();
        }
        catch(IOException e){
            System.out.println("unexpected error occured");
        }
    }
}