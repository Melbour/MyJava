import java.util.*;

/**
 * Created by asus on 2017/9/22.
 */
//把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，
// 因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
public class Ugly2 {
    static int GetUglyNumber_Solution(int n)
    {
        if(n==0)return 0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        int i2=0,i3=0,i5=0;
        while(al.size()<n)
        {
            int m2=al.get(i2)*2;
            int m3=al.get(i3)*3;
            int m5=al.get(i5)*5;
            int min=Math.min(m2,Math.min(m3,m5));
            al.add(min);
            if(min==m2)i2++;
            if(min==m3)i3++;
            if(min==m5)i5++;
        }
        return al.get(al.size()-1);
    }

    public static void main(String [] args){
        Scanner scanner =new Scanner (System.in);
        int a=scanner.nextInt();
        System.out.println(GetUglyNumber_Solution(a));


    }

}
