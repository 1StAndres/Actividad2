import java.util.Scanner;
public class Comparativa {
    public static void main(String[] args){
        Double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese el valor de A");
        a=sc.nextDouble();
        System.out.println("Favor ingrese el valor de B");
        b=sc.nextDouble();
        if (a<b){
            System.out.println("B ES MAYOR QUE A");
        }
        else if (a>b){
            System.out.println("A ES MAYOR QUE B");
        }
        else {
            System.out.println("A ES IGUAL A B");
        }
    }  
}
