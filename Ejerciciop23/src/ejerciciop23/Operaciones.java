package ejerciciop23;
public class Operaciones {
    double A,B,C;
    Operaciones(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    Double raiz_positiva(){
        return ((-B)+(Math.sqrt((Math.pow(B,2))-4*A*C)))/(2*A);
    }
    Double raiz_negativa(){
        return ((-B)-(Math.sqrt((Math.pow(B,2))-4*A*C)))/(2*A);
    }
}
