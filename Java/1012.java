import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

double p=3.14159;
double A=sc.nextDouble();
double B=sc.nextDouble();
double C=sc.nextDouble();


double TRIANGULO= (A*C)/2;
double CIRCULO=p*C*C;
double TRAPEZIO=((A+B)*C)/2;
double QUADRADO= B*B;
double RETANGULO= A*B;

       System.out.println("TRIANGULO: "+String.format("%.3f",TRIANGULO));
        System.out.println("CIRCULO: "+String.format("%.3f",CIRCULO));
        System.out.println("TRAPEZIO: "+String.format("%.3f",TRAPEZIO));
        System.out.println("QUADRADO: "+String.format("%.3f",QUADRADO));
        System.out.println("RETANGULO: "+String.format("%.3f",RETANGULO));
    }
}


