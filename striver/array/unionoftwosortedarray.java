import java.util.*;

public class union {

    public static int[] union_array(int nums1[], int nums2[]) {

        int i = 0;
        int j = 0;

        int n = nums1.length;
        int m = nums2.length;

        int merge[] = new int[n + m];

        int k = 0;

        while(i < n && j < m) {

            if(nums1[i] < nums2[j]) {

                if(k == 0 || merge[k-1] != nums1[i]) {
                    merge[k++] = nums1[i];
                }

                i++;
            }

            else if(nums1[i] > nums2[j]) {

                if(k == 0 || merge[k-1] != nums2[j]) {
                    merge[k++] = nums2[j];
                }

                j++;
            }

            else {

                // both are equal
                if(k == 0 || merge[k-1] != nums1[i]) {
                    merge[k++] = nums1[i];
                }

                i++;
                j++;
            }
        }


        while(i < n) {

            if(k == 0 || merge[k-1] != nums1[i]) {
                merge[k++] = nums1[i];
            }

            i++;
        }


        while(j < m) {

            if(k == 0 || merge[k-1] != nums2[j]) {
                merge[k++] = nums2[j];
            }

            j++;
        }


        return Arrays.copyOf(merge, k);
    }
}

      
