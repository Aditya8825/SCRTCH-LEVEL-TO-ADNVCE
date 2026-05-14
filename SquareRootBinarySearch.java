public class SquareRootBinarySearch {

    public static int sqrt(int n) {

        if (n == 0 || n == 1) return n;

        int low = 1, high = n;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (mid <= n / mid) { // avoid overflow
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(10)); // 3
    }
}