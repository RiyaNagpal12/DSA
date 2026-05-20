public class Maxones {
    // maxsubarray with atmost k zeroes 

    public static int length(int arr[], int k) {

        int left = 0;
        int right = 0;
        int zeroes = 0;
        int maxlength = 0;

        while (right < arr.length){

            // count zeroes
            if (arr[right] == 0) {
                zeroes++;
            }

            // shrink window if zeroes > k
            if(zeroes > k) {

                if (arr[left] == 0) {
                    zeroes--;
                }

                left++;
            }

            // calculate length
            int length = right - left + 1;
            maxlength = Math.max(length, maxlength);

            right++;
        }

        return maxlength;
    }

    public static void main(String[] args) {

        int arr[] = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        int k = 2;

        System.out.println(length(arr, k));
    }
}
    
