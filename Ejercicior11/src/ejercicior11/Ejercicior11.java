package ejercicior11;
import java.util.Scanner;
public class Ejercicior11 {

    public static void main(String[] args) {
        double numa,numb,numc,mayor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese el numero 1");
        numa=sc.nextDouble();
        System.out.println("Favor ingrese el numero 2");
        numb=sc.nextDouble();
        System.out.println("Favor ingrese el numero 3");
        numc=sc.nextDouble();
        Mayor m= new Mayor(numa,numb,numc);
        mayor= m.Mas_Grande();
        System.out.println("El numero mayor entre "+numa+", "+numb+", "+numc+", " +" es: "+mayor);
        
    }
    
}
