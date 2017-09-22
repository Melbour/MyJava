import java.util.Scanner;

/**
 * Created by asus on 2017/9/21.
 */
//在一个二维数组中，每一行从左到右递增，每一列从上到下递增。
    //输入一个二维数组跟这样一个整数，看是否在该数组中
public class Solution {
     static boolean Find(int target, int[][] array) {

        for(int i=0;i<array.length;i++){

            int low=0;
            int high=array[i].length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(target>array[i][mid]){
                    low=mid+1;
                }
                else if(target<array[i][mid]){
                    high=mid-1;
                }
                else
                    return true;

            }
        }
              return false;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.println("请输入行和列:");
        m=input.nextInt();
        n=input.nextInt();
        int arr[][]=new int[m][n];
        System.out.println();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=input.nextInt();
            }
        }
        while (input.hasNext()) {
            int target = input.nextInt();
            if(-1==target)
                break;
            System.out.println(Find(target, arr));
        }


    }
}