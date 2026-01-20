import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();
       
        boolean isOdd =( num & 1) == 1;

        if(isOdd){
            System.out.printf("The number (%d) is odd!", num);
        }else{
            System.out.printf("The number (%d) is even!", num);
        }

        sc.close();
    }
}