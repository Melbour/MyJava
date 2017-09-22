import java.util.Scanner;

/**
 * Created by asus on 2017/9/22.
 */
//请实现一个函数，将一个字符串中的空格替换成“%20”。
// 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
public class Space {
    static String replaceSpace(StringBuffer str) {
        if(str==null){
            return null;
        }
        StringBuffer sb = new StringBuffer();
        //String mystr=null;
       for(int i=0;i<str.length();i++){
           if (str.charAt(i) == ' ') {
              sb.append("%");
              sb.append("2");
              sb.append("0");
               // mystr+="%20";
           }
           else{
               sb.append(str.charAt(i));
               // mystr+=str.charAt(i);
           }

       }
       return sb.toString();
        //return mystr;
    }
    public static void main(String [] args){

       Scanner scanner =new Scanner (System.in);
       StringBuffer s=new StringBuffer();
       String s1=scanner.nextLine();
       s.append(s1);
       System.out.println(replaceSpace(s));

    }
}
