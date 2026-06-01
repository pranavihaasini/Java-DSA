import java.io.*;
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[99];
        int sum=0;
        for(int i=0;i<99;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int totalsum=(100*(100+1))/2;
        int res=totalsum-sum;
        System.out.println(res);
    }
}
