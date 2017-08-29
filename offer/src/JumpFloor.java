/**
 * Created by didi on 17/8/29.
 */
public class JumpFloor {

    public int JumpFloor(int target) {
        //dp[i]表示跳上i级台阶的跳法
        int[] dp = new int[target+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= target; i++){
            dp[i] = dp[i-2]+dp[i-1];
        }
        return dp[target];
    }
}
