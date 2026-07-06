class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }
        int max1 = arr[1];
        int n = arr.length;
        for(int i =0 ;i<n;i++){
            for(int j =i+1; j<n ; j++){
                if(arr[j] > max1){
                    max1 = arr[j];
                }
            }
            arr[i] = max1;
            max1= 0;
        }
        arr[n-1] = -1;
        return arr;
        
    }
}