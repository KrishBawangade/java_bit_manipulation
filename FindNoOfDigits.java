public class FindNoOfDigits {
    public static void main(String[] args){
        int n = 10;
        int base = 2;

        // find no. of digits
        int noOfDigits = (int) (Math.log(n)/Math.log(base)) + 1;

        System.out.println(noOfDigits);
    }
}
