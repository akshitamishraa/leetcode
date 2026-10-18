class Solution {
public int numOfSubarrays(int[] arr, int k, int threshold) {
int low = 0;
int high = k - 1;
int sum = 0;
int count = 0;

    for(int i = low; i <= high; i++){
        sum = sum + arr[i];
    }

    while(high < arr.length){
        if(sum >= k * threshold){
            count++;
        }

        sum = sum - arr[low];
        low++;
        high++;

        if(high < arr.length){
            sum = sum + arr[high];
        }
    }

    return count;
}

}
