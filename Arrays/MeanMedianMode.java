import java.io.*;
import java.util.*;
public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        float sum=0;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        float mean=sum/N;
        float median;
        if(N%2==0){
            median=(arr[N/2-1]+arr[N/2])/2.0f;
        }
        else{
            median=arr[N/2];
        }
        int mode=arr[0];
        int max=1,count=0;
        for(int j=1;j<N;j++){
            if(arr[j]==arr[j-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count>max){
                max=count;
                mode=arr[j];
            }
        }
        System.out.printf("%.2f %.2f %d",mean,median,mode);
    }
}
