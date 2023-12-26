import java.io.*;
class Writefile1{
    public static void main(String args[]) throws IOException{
        int i;
        try{
            FileOutputStream fout=new FileOutputStream("myfile.txt");
        
            fout.write(65);
            fout.close();
    }
    catch(IOException e){
        System.out.println("unexpected error occured"+e);
    }
  }
}