import java.io.*;
class Showfile{
    public static void main(String args[]) throws IOException{
        int i;
        FileInputStream fin=new FileInputStream("myfile.txt");
        /*catch(FileNotFoundException e){
            System.out.println("file not found");
        }*/
        /*catch(ArrayIndexOutOfBoundsException e){
            System.out.println("file name");
        }*/
        do{
            i=fin.read();
            if(i != -1)
            System.out.print((char)i);
        }
        while(i != -1);
        fin.close();
    }
}