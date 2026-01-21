public class ResetIthBit{
    public static void main(String[] args){
        int num = 20;

        int i=3;

        // create a mask by doing left shift to 1 by i-1 times and take its complement
        int mask = ~(1<<i-1);

        /*
            num & mask -> will reset i th bit to 0 if it is not  
        */
        System.out.println(num & mask);
    }
}