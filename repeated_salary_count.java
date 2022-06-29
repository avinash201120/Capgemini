import java.util.Scanner;
public class repeated_salary_count {
    public static void main(String args[]){
        int n,i,j,k,count=1;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        if(n<0){
            System.out.println("Invalid array size");
            System.exit(0);
        }
        else
        {
            int a[]=new int[100];
            for(i=0;i<n;i++){
                a[i]=in.nextInt();
                if(a[i]<0){
                    System.out.print("Invalid input");
                    System.exit(0);
                }
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;){
                if(a[i]==a[j]){
                    count++;
                    for(k=j;k<n;k++)
                            a[k]=a[k+1];
                    n--;        
                }
                else
                        j++;
            }
        }
    System.out.println(count);
        }
    }
}
