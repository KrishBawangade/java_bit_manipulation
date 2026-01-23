public class FindSumPascalTriangle{
    public static void main(String[] args){
        int n = 4;

        // sum = 1<<(n-1) = 2^n-1
        int sum = 1<<(n-1);

        System.out.println(sum);
    }
}