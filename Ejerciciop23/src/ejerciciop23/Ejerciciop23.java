package ejerciciop23;
import java.util.Scanner;
public class Ejerciciop23 {
    public static void main(String[] args) {
        double A,B,C,sol1,sol2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese el valor del coeficiente A");
        A=sc.nextDouble();
        System.out.println("Favor ingrese el valor del coeficiente B");
        B=sc.nextDouble();
        System.out.println("Favor ingrese el valor del coeficiente C");
        C=sc.nextDouble();
        Operaciones op=new Operaciones(A,B,C);
        sol1=op.raiz_positiva();
        sol2=op.raiz_negativa();
        System.out.println("Las soluciones son: "+sol1+" y "+sol2);
    }   
}
