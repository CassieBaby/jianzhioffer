/**
 * Created by didi on 17/8/27.
 */
public class FindArray {

    public boolean Find(int target, int [][] array) {

        if(array == null || array.length == 0 || array[0].length == 0){
            return false;
        }
        if(target < array[0][0] || target > array[array.length-1][array[0].length-1]){
            return false;
        }

        //从左下角开始
        for(int i = array.length-1, j=0; i >= 0 && j <=array[0].length-1;){
            if(array[i][j] == target){
                return true;
            }
            if(array[i][j] < target){
                j++;
                continue;
            }
            if(array[i][j] > target){
                i--;
                continue;
            }
        }
        return false;

    }
}
