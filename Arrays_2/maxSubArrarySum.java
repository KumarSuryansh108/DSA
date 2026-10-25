public class maxSubArrSum {
    // Brute force method
    public static void Method1(int[] arr){
        int maxsum = Integer.MIN_VALUE ;
        
        for(int i = 0 ; i<arr.length ; i++){
            // O(n^2)
            int currsum = 0;
            for(int j = i ; j < arr.length ; j++){
                currsum += arr[j];
                if(currsum > maxsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println(maxsum);
    }

    public static void Method2(int[] arr){
        // O(n^2)
        // Prefix sum : Method uses a prefix array which stores the ith index sum
        // jis index pe hai waha se pehle pehle saare numbers kaa sum
        int maxsum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];

        // creating the prefix array
        prefix[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i++ ){
            prefix[i] = arr[i] + prefix[i - 1];
        }

        // now calculating the maximum sum : 
        for(int i = 0; i < prefix.length ; i++){
            int currsum = 0;
            for(int j = i ; j < prefix.length ; j++){
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            if(currsum > maxsum){
                maxsum = currsum;
            }
        }
        System.out.println("Max Sum : "+maxsum );  
    }

    public static void KadaneAlgo(int[] arr){
        //  O(n)
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            currsum = currsum + arr[i];
            if(currsum < 0){
                currsum = 0;
            }
            if(currsum > maxsum){
                maxsum = currsum;
            }
        }
        System.out.println("Max subarraysum using kadane is : "+maxsum);

    }

    

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Method 1 :");
        Method1(arr);
        System.out.println("Method 2 :");
        Method2(arr);
        System.out.println("Kadane :");
        KadaneAlgo(arr);

    }
}
