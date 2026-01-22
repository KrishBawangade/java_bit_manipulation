public class FindRightMostSetBit{
    public static void main(String[] args){
        int num = 20;
        
        // find 2s complement of the number
        int negativeNum = ~num+1;

        // perform log(negativeNum)/log(2) + 1 to find the bit
        System.out.println( ((int) (Math.log(num & negativeNum) / Math.log(2))) + 1 );
    }
}