public class trappingwater {

    public static int trapwater(int height[]) {

        int left_max[] = new int[height.length];
        int right_max[] = new int[height.length];

        left_max[0] = height[0];

        for (int i = 1; i < height.length; i++) {

            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }

        right_max[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {

            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }

        int water = 0;

        for (int i = 0; i < height.length; i++) {

            water += Math.min(left_max[i], right_max[i]) - height[i];
        }

        return water;
    }

    public static void main(String[] args) {

        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println(trapwater(height));
    }
}
