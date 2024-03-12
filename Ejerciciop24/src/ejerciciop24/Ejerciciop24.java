package ejerciciop24;
import java.util.Scanner;
public class Ejerciciop24 {
    public static void main(String[] args) {
        double pea,peb,pec;
        String resul;
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese el peso de la esfera A");
        pea=sc.nextDouble();
        System.out.println("Favor ingrese el peso de la esfera B");
        peb=sc.nextDouble();
        System.out.println("Favor ingrese el peso de la esfera C");
        pec=sc.nextDouble();
        Mayor m=new Mayor(pea,peb,pec);
        resul= m.Masgrande();
        System.out.println(resul);
    }   
}
