package Arrays;

public class LargestNum {
    
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,2,4,54,22,12,0,445,5,43,322,45};
        int largest = getLargest(arr);
        int smallest = getSmallest(arr);
        System.out.println("Largest num in array is : "+largest);
        System.out.println("And smallest num in array is : "+smallest);

    }
}
