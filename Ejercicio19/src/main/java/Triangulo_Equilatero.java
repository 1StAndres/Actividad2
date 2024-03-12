
public class Triangulo_Equilatero {
    double lado;
    Triangulo_Equilatero(double lado){
        this.lado = lado;
    }
    double calcular_Area(){
        return (Math.pow(lado,2)*Math.sqrt(3))/4;
    }
    double calcular_Altura(){
        return (lado*Math.sqrt(3))/2;
    }
    double calcular_Perimetro(){
        return lado*3;
    }
}
