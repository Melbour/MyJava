/**
 * Created by asus on 2017/9/22.
 */
public class Ugly {
    public int GetUglyNumber_Solution(int index) {
        int count=0;
         for(int i=1;i<100000000;i++)
         {
             int k=i;
             while(k%2==0)
             {
                 k/=2;
             }
             while(k%3==0)
             {
                 k/=3;
             }
             while(k%5==0)
             {
                 k/=5;
             }
             if(1==k)
             {
                 count++;
             }
             if(count==index)
             {
                 //System.out.println(i);
                 return i;
             }

         }



        return 0;
    }

}
