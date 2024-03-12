
public class Triangulo {
    double ladoa,ladob,ladoc;
    double s;
    Triangulo(double ladoa,double ladob,double ladoc){
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
    }
    double calcular_Area(){
        s=(ladoa+ladob+ladoc)/2;
        return Math.sqrt(s*(s-ladoa)*(s-ladob)*(s-ladoc));
    }
    double calcular_Perimetro(){
        return ladoa+ladob+ladoc;
    }
    double calcular_Semiperimetro(){
        return (ladoa+ladob+ladoc)/2;
    }
}

