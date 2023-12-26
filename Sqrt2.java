class Sqrt2{
    static double calculateSqrt(double num) {
double answer;
answer = Math.sqrt(num);
// Compute the square root of num
// and store in answer
return answer;
    }
   
    public static void main(String args[]){
        double result=calculateSqrt(25.00);
        System.out.println("sqrt is:"+result);
        }
    }