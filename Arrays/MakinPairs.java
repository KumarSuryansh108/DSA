package Arrays;

public class MakinPairs {
    
    public static void makepairs(int[] arr){
        for(int i = 0 ; i <= arr.length ; i++){
            // int curr = arr[i];
            for(int j = i + 1 ; j < arr.length ; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        makepairs(numbers);
    }
}
