public class Duplicate {
    static void sameelement(int[] arr) {
        int n = arr.length;
        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(
                        "Duplicate element: " + arr[i]
                    );
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No duplicate found");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,4};
        sameelement(arr);
    }
}