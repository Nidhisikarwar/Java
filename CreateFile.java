import java.io.File;
//importing file class
import java.io.IOException;
//importing the IOException for handling errors
class CreateFile{
    public static void main(String args[]){
        try{
        //creating an object of a file
        File obj=new File("myfile.txt");
        if(obj.createNewFile()){
        System.out.println("New file:"+obj.getName());
        System.out.println("File created");
    }
    else{
        System.out.println("File is already existing");
    }
}
catch(IOException e){
    System.out.println("An unexpected error is occured"+e);
}
}
}    