package Arrays;

public class LinearSearch {

    public static void linearSearch(int[] arr,int key){
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]== key){
                System.out.println("Found at index : " + i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        linearSearch(arr, 5);


    }
}
