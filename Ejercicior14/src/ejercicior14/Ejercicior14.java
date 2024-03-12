package ejercicior14;
import java.util.Scanner;
public class Ejercicior14 {

    public static void main(String[] args) {
        double vd1,vd2,vd3,sd1,sd2,sd3,sd1_,sd2_,sd3_,tventas,porven;
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese el valor de ventas del departamento 1");
        vd1=sc.nextDouble();
        System.out.println("Favor ingrese el valor de ventas del departamento 2");
        vd2=sc.nextDouble();
        System.out.println("Favor ingrese el valor de ventas del departamento 3");
        vd3=sc.nextDouble();
        System.out.println("Favor ingrese el valor del salario del vendedor del departamento 1");
        sd1=sc.nextDouble();
        System.out.println("Favor ingrese el valor del salario del vendedor del departamento 2");
        sd2=sc.nextDouble();
        System.out.println("Favor ingrese el valor del salario del vendedor del departamento 3");
        sd3=sc.nextDouble();
        tventas=vd1+vd2+vd3;
        porven=tventas*0.33;
        if (vd1>porven){
            sd1_=sd1+(sd1*0.2);
        }
        else{
            sd1_=sd1;
        }
        if (vd2>porven){
            sd2_=sd2+(sd2*0.2);
        }
        else{
            sd2_=sd2;
        }
        if (vd3>porven){
            sd3_=sd3+(sd3*0.2);
        }
        else{
            sd3_=sd3;
        }
        System.out.println("SALARIO VENDEDORES DEPTO 1 "+sd1_+"SALARIO VENDEDORES DEPTO. 2 "+sd2_+ "SALARIO VENDEDORES DEPTO. 3 "+sd3_);        
    }
    
}
