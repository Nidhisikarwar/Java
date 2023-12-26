class Stringsorting{
public static void main(String args[]){
    String s[]={"Hi", "this" ,"is" ,"school", "of", "electronics"};
    for(int i=0;i<s.length;i++){
        for(int j=i+1;j<s.length;j++){
            if(s[i].compareTo(s[j])>0){
                String t=s[i];
                s[i]=s[j];
                s[j]=t;
            }
}
System.out.println(s[i]+" ");
}
}
}