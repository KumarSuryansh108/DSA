public class TrappingRainwater {

    public static int TrapRainWater(int[] height){
        // Approach : 

        // Calculate left max Boundary - array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1 ; i < height.length ; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);

        } 
        // Calculate Right max Boundary - array
        int rightmax[] = new int[height.length];
        rightmax[rightmax.length - 1] = height[height.length - 1];
        for(int i = height.length - 2 ; i >= 0 ; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        int watertrapped = 0;
        // Loop :
        for(int i = 0 ; i < height.length ; i++){
            int WaterLevel = Math.min(leftmax[i], rightmax[i]);
            watertrapped += (WaterLevel - height[i]);
        }
            // Calculate WaterLevel(i) = min(Leftmax(i) - Rightmax(i))
            // Waterlevel(i) - Height of bar(i) = Rainwater trapped(i)
            // rainwatertrapped final += rainwatertrapped (i)
        return watertrapped;

    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Rain Water Trapped : "+TrapRainWater(height));
    }
    // Time complxity : No of bars.. O(n) this is the most optimum method.
}
