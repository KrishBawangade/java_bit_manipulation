import java.util.Arrays;

public class FlippingImage{

    static int[][] flipAndInvertImage(int[][] image) {
        // traverse each row
        for(int[] row : image){
            int start = 0;
            int end = row.length-1;

            while(start<=end){
                if(start == end){
                    // invert the bits if start = end and break
                    row[start] = row[start] ^ 1;
                    break;
                }

                // swap and invert the bits at the same time
                int temp = row[start] ^ 1;
                row[start] = row[end] ^ 1;
                row[end] = temp;
                start++;
                end--;
            }
        }

        return image;
    }

    public static void main(String[] args){
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] flippedImage = flipAndInvertImage(image);

        System.out.println(Arrays.deepToString(flippedImage));
    }
}