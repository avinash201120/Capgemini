import java.util.*;
public class Customer_and_invoice {
    public static void main(String args[]){
        int id,dis,iid,cost,dcost;
        double fcost;
        String s;
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
        s=sc.next();
        dis=sc.nextInt();
        iid=sc.nextInt();
        cost=sc.nextInt();
        dcost=(int)(cost*(dis/100.0f));
        fcost=cost-dcost;
        System.out.println(iid);
        System.out.println(s);
        System.out.println(dis);
        System.out.println(fcost);
    }
}

