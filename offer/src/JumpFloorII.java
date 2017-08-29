/**
 * Created by didi on 17/8/29.
 */
public class JumpFloorII {

    public int JumpFloorII(int target) {
        //dp[n]表示跳上n级台阶的跳法
        int[] dp = new int[target+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= target; i++){
            for(int j = 0; j <= i-1; j++){
                dp[i] += dp[j];
            }
        }
        return dp[target];
    }
}
