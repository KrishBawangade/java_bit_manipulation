public class SetIthBit{
    public static void main(String[] args){
        int num = 20;

        int i=4;

        // create a mask by doing left shift to 1 by i-1 times
        // if i = 3, mask = 100
        int mask = 1<<i-1;

        /*
            num | mask -> will set i th bit to 1 if it is not  
        */
        System.out.println(num | mask);
    }
}