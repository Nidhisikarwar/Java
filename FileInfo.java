import java.io.File;
class FileInfo{
    public static void main(String args[]){
        File f1=new File("myfile.txt");//creating a file object
        if(f1.exists()){
            System.out.println("The name of the file is:"+f1.getName());//getting file name
            System.out.println("The absolute path of the file is:"+f1.getAbsolutePath());//g     etting path of the file
            System.out.println("is File writable?:"+f1.canWrite());//checking whether file is writable or not
            System.out.println("is File readable?:"+f1.canRead());//checking whether file is readable or not
            System.out.println("The size of the file in the bytes is:"+f1.length());//getting the length of the file in bytes
        }
        else{
            System.out.println("the file does not exist");
        }
    }
}
