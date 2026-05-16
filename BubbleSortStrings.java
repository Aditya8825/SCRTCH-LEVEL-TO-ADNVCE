// public class stringsortinng {
//     static void bubblesort(String[] arr){
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-1-i; j++){

//                 if(arr[j].compareTo(arr[j+1])>0){

//                     String temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;

//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         String[] arr={"banna", "Apple","mango","cherry"};
//         bubblesort(arr);
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr+" ");
//         }
//     }
// }


public class BubbleSortStrings {

    static void bubbleSort(String[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j].compareTo(arr[j + 1]) > 0) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        String[] arr = {"Banana", "Apple", "Mango", "Cherry"};

        bubbleSort(arr);

        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}