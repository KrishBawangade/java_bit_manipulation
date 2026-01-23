public class FindPowerOf2OrNot{
    public static void main(String[] args){
        int n = 128;

        boolean isPowerOf2 = (n & (n-1)) == 0;
        
        if(isPowerOf2){
            System.out.printf("Number(%d) is power of 2", n);
        }else{
            System.out.printf("Number(%d) is not a power of 2", n);
        }
    }
}