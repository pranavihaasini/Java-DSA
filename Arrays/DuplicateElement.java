import java.io.*;
import java.util.*;
public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int ele=0;
        for(int j=0;j<N;j++){
            for(int k=j+1;k<N;k++){
                if(arr[j]==arr[k])
                {
                    ele=arr[j];
                    break;
                }
            }
        }
        System.out.println(ele);
    }
}
