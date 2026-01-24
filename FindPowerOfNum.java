public class FindPowerOfNum{
    public static void main(String[] args){
        int a = 2;
        int b = 3;

        int ans = 1; // initial value for a^b
        int base = a;


        while(b>0){
            int lastDigit = b&1;
            if(lastDigit == 1){
                // update the answer if the bit is set(1)
                ans = ans * base;
            }

            // update the base in each iteration
            base = base * base;

            // remove the last digit
            b = b>>1;
        }

        System.out.println(ans);
    }
}