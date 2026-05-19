public class bassicPair {

    static void twosum(int[] arr, int target) {

        int n = arr.length;

        boolean found = false;

        for (int i = 0;  i < n - 1; i++) {

            for (int j = i ; j < n; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println(
                        "Pair found: " + arr[i] + " and " + arr[j]
                    );

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Pair not found");
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 9};
        int target = 9;

        twosum(arr, target);
    }
}