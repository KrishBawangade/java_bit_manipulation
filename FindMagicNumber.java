public class FindMagicNumber{

    public static void main(String[] args){
        int n=5;
        int magicNum = 0;
        int i=1;

        while(n>0){
            // extract the last bit of the number
            int lastBit = n & 1;

            // perform calculation as magicNum = magicNum + (lastBit * 5^i)
            magicNum += (lastBit*Math.pow(5, i));
            i++;

            // right shift n as we need the next bit before last bit
            n = n >> 1;
        }

        System.out.println(magicNum);

    }
}