//思路：循环二分法，寻找右边界
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
       return helper(array,k)-helper(array,k-1);
    }
    public int helper(int [] array , int k){
        int i=0,j=array.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(array[m]<=k) i=m+1;
            else j=m-1;
        }
        return i;
    }
}
