class StringOperation2{
    public static void main(String args[]){
        String s1="Nidhi sikarwar";
        String s2="this is java";
        String s3="this is java";
        System.out.println("comparing first and second string");
        System.out.println(s1.compareTo(s2));
        System.out.println("comparing second and third string");
        System.out.println(s2.compareTo(s3));
        System.out.println("comparing second and first string");
        System.out.println(s2.compareTo(s1));
        System.out.println("index of i:"+ s1.indexOf('i'));//gives first occurence of a character
        System.out.println("Last index of i:"+ s1.lastIndexOf('i'));//gives last occurence of a character
        System.out.println("index of i:"+ s1.indexOf("ar"));
        System.out.println("Lastindex of i:"+ s1.lastIndexOf('i',4));
    }
}