public class jorge {

    public static void main(String[] argus){
 System.out.println(factorial(5));
    }

    public static long factorial(int n){
return n == 0 ? 1 : (n * factorial(n - 1));
    }
    
}