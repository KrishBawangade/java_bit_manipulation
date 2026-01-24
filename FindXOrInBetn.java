public class FindXorInBetn{

    static int findXorTillN(int n){
        int ans = 0;
        if(n%4 == 0){
            ans = n;
        }

        if(n%4 == 1){
            ans = 1;
        }

        if(n%4 == 2){
            ans = n+1;
        }

        if(n%4 == 3){
            ans = 0;
        }

        return ans;
    }

    public static void main(String[] args){
        int n1 = 3;
        int n2 = 9;

        int xor1 = findXorTillN(n1); 
        int xor2 = findXorTillN(n2); 

        System.out.println(xor1 ^ xor2);
    }
}