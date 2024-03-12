import java.util.Scanner;
public class Matricula {
    public static void main(String[] args){
        Double patrimonio,numero_ins,valor_Matricula;
        int estrato;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese el nombre del estudiante");
        nombre=sc.next();
        System.out.println("Favor ingrese el numero de inscripcion del estudiante");
        numero_ins=sc.nextDouble();
        System.out.println("Favor ingrese el estrato del estudiante");
        estrato=sc.nextInt();
        System.out.println("Favor ingrese el patrimonio del estudiante");
        patrimonio=sc.nextDouble();
        Pago_Matricula pago= new Pago_Matricula(estrato,patrimonio);
        valor_Matricula = pago.Valor_Matricula();
        System.out.println("El estudiante con numero de inscripcion: "+numero_ins+" y nombre: "+nombre+" debe pagar: "+ valor_Matricula);
    }  
}
