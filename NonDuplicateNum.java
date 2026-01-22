public class NonDuplicateNum{

    static int findIthBit(int num, int i){
        // create a mask by doing left shift to 1 by i-1 times
        // if i = 3, mask = 100
        int mask = 1<<i-1;


        // extract the bit from the bitwise AND operation
        // lets say AND -> 100, so perform right shift by i-1 to get the Most significant bit
        int bit = (num & mask) >> i-1;

        return bit;
    }
    public static void main(String[] args){
        int[] arr = {2,2,6,2,7,7,8,7,8,8};
        int num = 0;
        int[] bitCount = new int[32]; // array to store the bitCount

        // count bits for each position
        for(int ele: arr){
            for(int i=0; i<32; i++){
                int bit = findIthBit(ele, i+1);
                if(bit == 1){
                    bitCount[i]++;
                }
            }
        }

        // perform modulus 3 on each bit
        for(int i=0; i<32; i++){
            int count = bitCount[i];
            bitCount[i] = count % 3;
        }

        // calculate the no. from the array
        for(int i =0; i<32; i++){
            num+= (Math.pow(2, i) * bitCount[i]);
        }

        System.out.println(num);

    }
}