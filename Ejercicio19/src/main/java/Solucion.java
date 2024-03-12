import java.util.Scanner;
public class Solucion {
    public static void main(String[] args){
        double lado,altura,area,perimetro;
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese el lado del triangulo equilatero: ");
        lado = sc.nextDouble();
        Triangulo_Equilatero trian= new Triangulo_Equilatero(lado);
        altura=trian.calcular_Altura();
        area=trian.calcular_Area();
        perimetro=trian.calcular_Perimetro();
        System.out.println("El valor de la altura es de: "+altura);
        System.out.println("El valor del área es de: "+area);
        System.out.println("El valor del perimetro es de: "+perimetro);
        
    }
}
