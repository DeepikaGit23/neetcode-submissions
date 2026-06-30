class Solution {
    public int[] replaceElements(int[] arr) {

        // left to right approach
        // current position gets replced with next max val

        for(int i=0; i<arr.length; i++)
        {
            int max = -1; 
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j]>max)
                {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }


        // Right to left approach
        // int rightMax = -1;

        // for (int i = arr.length - 1; i >= 0; i--) {
        //     int newMax = Math.max(rightMax, arr[i]);
        //     arr[i] = rightMax;
        //     rightMax = newMax;
        // }

        return arr;
    }
}