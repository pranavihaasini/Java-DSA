import java.io.*;
import java.util.*;
public class OddAndEvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int esum=0,osum=0;
        for(int j=0;j<N;j++){
            if(arr[j]%2==0)
                esum+=arr[j];
            else
                osum+=arr[j];
        }
        System.out.println(osum+" "+esum);
    }
}
