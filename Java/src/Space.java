import java.util.Scanner;

/**
 * Created by asus on 2017/9/22.
 */
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
