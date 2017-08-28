/**
 * Created by didi on 17/8/27.
 */
public class ReplaceSpace {

    public String replaceSpace(StringBuffer str) {
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                str.replace(i,i+1,"%20");
                i = i+1;
            }
        }
        return str.toString();
    }

    public static void main(String[] args){
        StringBuffer str = new StringBuffer();
        str.append("Hello World Hello");
        ReplaceSpace rs = new  ReplaceSpace();
        System.out.println(rs.replaceSpace(str));


    }
}
