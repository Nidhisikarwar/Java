class Max {
    public static void main(String args[]) {
    if (args.length == 0) 
    return;
    int max = Integer.parseInt(args[0]); 
    for (int i=1; i < args.length; i++) {
    if (Integer.parseInt(args[i]) > max) {
    max = Integer.parseInt(args[i]);
    }
    }
    System.out.println(max);
    }
    }