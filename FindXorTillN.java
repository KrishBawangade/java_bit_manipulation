public class FindXorTillN{
    public static void main(String[] args){
        int n = 9;
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
        

        System.out.println(ans);
    }
}