package offercode;

public class offer_04 {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(str));

    }

    public static String replaceSpace(StringBuffer str) {

        StringBuffer res = new StringBuffer();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c==' '){
                res.append("%20");
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
