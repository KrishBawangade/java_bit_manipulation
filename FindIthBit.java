public class FindIthBit{
    public static void main(String[] args){
        int num = 20;

        int i=5;

        // create a mask by doing left shift to 1 by i-1 times
        // if i = 3, mask = 100
        int mask = 1<<i-1;


        // extract the bit from the bitwise AND operation
        // lets say AND -> 100, so perform right shift by i-1 to get the Most significant bit
        int bit = (num & mask) >> i-1;

        System.out.println(bit);
    }
}