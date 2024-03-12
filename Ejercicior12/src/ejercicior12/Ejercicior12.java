
package ejercicior12;
import java.util.Scanner;
public class Ejercicior12 {

    public static void main(String[] args) {
        String nombres;
        int horas;
        double vhora,salariod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese el o los nombres del empleado");
        nombres=sc.next();
        System.out.println("Favor ingrese el numero de horas trabajadas");
        horas=sc.nextInt();
        System.out.println("Favor ingrese el valor de la hora");
        vhora=sc.nextDouble();
        Salario s=new Salario(horas,vhora);
        salariod= s.Total();
        System.out.println("El trabajador "+nombres+" Devengo: $"+salariod);
    }
    
}
