/**
 * Created by asus on 2017/9/22.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ugly1 {
    static int GetUglyNumber_Solution(int index) {
        int allNum[] = new int[1000];
        int num = 0;
        double MaxNum = 2 << 31 - 10;
        int nMaxNum = (int) MaxNum;
//        System.out.println(nMaxNum);
        int s1, s2, s3;
        for (int i = 0; i < 31; i++) {
            s1 = (int) Math.pow(2, i);
            //boolean isgoon=true;
            if (nMaxNum < s1) break;
            for (int j = 0; j < 20; j++) {
                s2 = (int) Math.pow(3, j);
                if (nMaxNum / s1 < s2)
                    break;
                for (int k = 0; k < 15; k++) {
//
                    s3 = (int) Math.pow(5, k);
                    if (nMaxNum / s1 / s2 < s3)
                        break;
                    allNum[num++] = s1 * s2 * s3;
                }

            }
        }
        Arrays.sort(allNum, 0, num);
//        7
        return allNum[index - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(GetUglyNumber_Solution(i));


    }
}
