package ejerciciop22;
import java.util.Scanner;
public class Ejerciciop22 {
    public static void main(String[] args) {
        double horas,shoras,salario;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese el nombre del empleado: ");
        nombre= sc.next();
        System.out.println("Favor ingrese las horas trabajadas: ");
        horas= sc.nextDouble();
        System.out.println("Favor ingrese el salario por hora: ");
        shoras=sc.nextDouble();
        Salario s= new Salario(horas,shoras);
        salario=s.calcular_Salario();
        if(salario>450000){
            System.out.println(nombre+" salario: $"+salario);
        }
        else{
            System.out.println(nombre);
        }
    }   
}
