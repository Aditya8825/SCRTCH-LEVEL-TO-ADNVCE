import java.util.HashMap;

public class countpairs {

    static int countPairs(int arr[], int k) {

        // Stores frequency of elements seen so far
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int num : arr) {

            // Number needed to make sum k
            int complement = k - num;

            // If complement exists, add its frequency
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            // Add current number to map
            if (map.containsKey(num)) {
                int freq = map.get(num);
                map.put(num, freq + 1);
            } else {
                map.put(num, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int arr[] = {1, 5, 7, -1, 5};
        int k = 6;

        System.out.println("Number of pairs = " + countPairs(arr, k));
    }
}