
import java.util.Scanner;
public class Solu {
    public static void main(String[] args){
        double ladoa,ladob,ladoc,area,perimetro,semiperimetro;
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese el lado 1 del triangulo: ");
        ladoa = sc.nextDouble();
        System.out.println("Favor ingrese el lado 2 del triangulo: ");
        ladob = sc.nextDouble();
        System.out.println("Favor ingrese el lado 3 del triangulo: ");
        ladoc = sc.nextDouble();
        Triangulo trian= new Triangulo(ladoa,ladob,ladoc);
        perimetro=trian.calcular_Perimetro();
        area=trian.calcular_Area();
        semiperimetro=trian.calcular_Semiperimetro();
        System.out.println("El valor del perimetro es de: "+perimetro);
        System.out.println("El valor del semiperimetro es de: "+semiperimetro);
        System.out.println("El valor del área es de: "+area);
        
    }
}
