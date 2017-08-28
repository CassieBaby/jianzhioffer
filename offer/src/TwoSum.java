import java.util.ArrayList;

/**
 * Created by didi on 17/8/27.
 * leetcode 和为S的两个数字
 */
public class TwoSum {

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        long minProduct = Long.MAX_VALUE;
        int left = 0;
        int right = array.length-1;
        ArrayList<Integer> ret = new ArrayList<Integer>();
        while(left < right){
            if(array[left] + array[right] == sum) {
                if (array[left] * array[right] < minProduct) {
                    minProduct = array[left] * array[right];
                    ret.clear();
                    ret.add(array[left]);
                    ret.add(array[right]);
                }
                left++;
                right--;
            } else if(array[left] + array[right] < sum){
                    left++;
            }else{
                    right--;
            }
        }
        return ret;
    }
}
