import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A=sc.nextDouble();
       double B=sc.nextDouble();
       double C=sc.nextDouble();
       double X=((A*2)+(B*3)+(C*5))/(2+3+5);
        System.out.println("MEDIA = "+String.format("%.1f",X));
    }
}
