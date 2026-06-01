import java.util.*;
public class NumberDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int p = 0, n = 0, z = 0;
        for(int j = 0; j < N; j++) {
            if(arr[j] == 0)
                z++;
            else if(arr[j] > 0)
                p++;
            else
                n++;
        }
        System.out.println(z + " " + p + " " + n);
    }
}
