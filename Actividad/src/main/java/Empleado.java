import java.util.Scanner;
public class Empleado {    
    public static void main(String[] args){
        double horas,shoras,retencion,tretencion,sbruto,sneto;
        String nombre,codigo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese el nombre del empleado: ");
        nombre= sc.next();
        System.out.println("Favor ingrese el codigo del empleado: ");
        codigo= sc.next();
        System.out.println("Favor ingrese las horas trabajadas: ");
        horas= sc.nextDouble();
        System.out.println("Favor ingrese el salario por hora: ");
        shoras=sc.nextDouble();
        System.out.println("Favor ingrese la taza de retencion: ");
        tretencion=sc.nextDouble();
        Salario sal= new Salario(horas,shoras,tretencion);
        sbruto= sal.calcular_Sbruto();
        retencion= sal.retencion();
        sneto=sal.sneto();
        System.out.println("Nombre: "+ nombre);
        System.out.println("Codigo:: "+ codigo);
        System.out.println("Salario bruto: "+ sbruto);
        System.out.println("Salario neto: "+ sneto);
        
    }
}
