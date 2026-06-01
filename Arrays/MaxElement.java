import java.io.*;
import java.util.*;

public class MaxElement{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int j=0;j<N;j++){
            if(max<arr[j])
            max=arr[j];
        }
        System.out.println(max);
    }
}
