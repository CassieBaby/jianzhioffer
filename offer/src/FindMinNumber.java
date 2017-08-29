/**
 * Created by didi on 17/8/29.
 * 剑指offer 旋转数组的最小数字【需要重刷】
 */
public class FindMinNumber {

    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }
        int left = 0;
        int right =  array.length - 1;
        int mid = 0;
        while(array[left] > array[right]){
            mid = (right-left)/2+left;
            if(array[left] < array[right]){
                return array[left];
            }
            if(left == right-1){
                return array[right];
            }
            if(array[mid]>array[left]){
                left = mid;
                continue;
            }
            if(array[mid] < array[right]){
                right = mid;
                continue;
            }
        }
        return array[right];

    }
    public  static void main(String[] args){
        FindMinNumber fnn = new FindMinNumber();
        int[] array = {3,4,5,1,2};
        System.out.println(fnn.minNumberInRotateArray(array));
    }


}
