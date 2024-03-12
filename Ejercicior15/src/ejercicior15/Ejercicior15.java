package ejercicior15;
import java.util.Scanner;
public class Ejercicior15 {

    public static void main(String[] args) {
        double pea,peb,pec,ped;
        String diferente,diferencia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese el peso de la esfera A");
        pea=sc.nextDouble();
        System.out.println("Favor ingrese el peso de la esfera B");
        peb=sc.nextDouble();
        System.out.println("Favor ingrese el peso de la esfera C");
        pec=sc.nextDouble();
        System.out.println("Favor ingrese el peso de la esfera D");
        ped=sc.nextDouble();
        if ((pea==peb)&&(pea==pec)){
            diferente="La esfera D";
            if (ped>pea){
                diferencia="tiene un peso es mayor que las otras esferas";
            }
            else{
                diferencia="tiene un peso es menor que las otras esferas";
            }
        }
        else if ((pea==peb)&&(pea==ped)){
            diferente="La esfera C";
            if (pec>pea){
                diferencia="tiene un peso mayor que las otras esferas";
            }
            else{
                diferencia="tiene un peso menor que las otras esferas";
            }
        }
        else if ((pea==pec)&&(pea==ped)){
            diferente="La esfera B";
            if (peb>pea){
                diferencia="tiene un peso mayor que las otras esferas";
            }
            else{
                diferencia="tiene un peso menor que las otras esferas";
            }
        }
        else{
            diferente="La esfera A";
            if (pea>peb){
                diferencia="tiene un peso mayor que las otras esferas";
            }
            else{
                diferencia="tiene un peso menor que las otras esferas";
            }
        }
        System.out.println(diferente+" es la diferente y "+diferencia);
    } 
}
