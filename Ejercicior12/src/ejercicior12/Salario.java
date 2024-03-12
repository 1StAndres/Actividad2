
package ejercicior12;

public class Salario {
    int horas,horase,horase8;
    double vhora,salario;
    Salario(int horas,double vhora){
        this.horas = horas;
        this.vhora = vhora;
    }
    double Total(){
        if (horas>40){
            horase=horas-40;
            if (horase>8){
                horase8=horase-8;
                salario=(40*vhora)+(16*vhora)+(horase8*3*vhora);
            }
            else{
                salario=(40*vhora)+(horase*2*vhora);
            }
        }
        else{
            salario=horas*vhora;
        }
        return salario;
    }
}
