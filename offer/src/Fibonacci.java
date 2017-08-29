/**
 * Created by didi on 17/8/29.
 */
public class Fibonacci {

    public int Fibonacci(int n) {
        if(n < 1){
            return 0;
        }
        if(n == 1 || n ==2){
            return 1;
        }

        int res = 1;
        int pre = 1;
        int temp =0;
        for(int i = 3; i <= n; i++){
            temp = res;
            res = res+pre;
            pre = temp;
        }
        return res;
    }
}
