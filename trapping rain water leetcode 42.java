class Solution {
    public int trap(int[] arr) {
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            res += Math.min(leftVal(arr, i), rightVal(arr, i))-arr[i];
        }
        return res;
    }
    public int rightVal(int[] arr, int i){
        int right = arr[i];
        for(int j = i; j < arr.length; j++){
            if(arr[j] > right)
                right = arr[j];       
        }
        return right;
    }
    public int leftVal(int[] arr, int i){
        int left = arr[i];   
        for(int j = i; j >= 0; j--){
            if(arr[j] > left)
                left = arr[j];       
        }
        return left;
    }
}