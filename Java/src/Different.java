/**
 * Created by asus on 2017/9/21.
 */

import java.util.Scanner;

public class Different {

    static boolean checkDifferent(String iniString) {
        for (int i = 0; i < iniString.length() - 1; i++) {
            for (int j = i + 1; j < iniString.length(); j++) {
                if ((iniString.charAt(i) ^ iniString.charAt(j)) == 0) {
                    return false;
                }
            }

        }
        return true;
    }
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        while (scanner.hasNext()){
        String s=scanner.next();
        System.out.println(checkDifferent(s));


    }}






    }


