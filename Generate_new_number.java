import java.lang.Math;
import java.util.Scanner;
public class Generate_new_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,res=0,rem;
        n=sc.nextInt();

        if(n>32767) {
            System.out.println("Number too large");
        }else if(n<0){
            System.out.println("Number too small");
        }else {
            while(n>0) {
                rem = n%10;
                n/=10;
                res = res*10 + (rem+2);
            }
            while(res > 0) {
                rem = res%10;
                res /=10;
                n = n*10 +rem;
            }
            System.out.println(n);
        }

    }
}
