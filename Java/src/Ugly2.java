import java.util.*;

/**
 * Created by asus on 2017/9/22.
 */
//��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ�
// ��Ϊ����������7�� ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
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
