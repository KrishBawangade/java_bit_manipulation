public class FindNoOfBits{

    public static void main(String[] args){
        int n = 56;
        int copy = n;
        int count = 0; // counter to count set bits

        while(copy>0){
            // finding 2s complement
            int negativeNum = ~copy + 1;

            // finding the rightmost bit
            int res = n & negativeNum;

            count++;

            // removing the current right most bit
            copy -= res;
        }

        System.out.println(Integer.toBinaryString(n));
        System.out.println(count);
    }
}