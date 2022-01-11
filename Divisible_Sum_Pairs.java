import java.util.Scanner;
public class Divisible_Sum_Pairs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((a[i]+a[j])%k==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}