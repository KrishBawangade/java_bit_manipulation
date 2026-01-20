public class SingleFreqNo{
    public static void main(String[] args){
        int[] arr = {2,3,4,1,2,1,3,6,4};
        int num = arr[0];

        // perform X-OR for each element in the array
        /*
            As, 
                1. a^0 = a
                2. a^a = 0

            That means we will be left with 0^n = n (ans)
        */
        for(int i=1; i<arr.length; i++){
            int ele = arr[i];
            num ^= ele;
        }

        System.out.println("The number is "+num);
    }
}