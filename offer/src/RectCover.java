

/**
 * Created by didi on 17/8/29.
 */
public class RectCover {

    public int RectCover(int target) {

        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        return RectCover(target-2)+RectCover(target-1);

    }
}
