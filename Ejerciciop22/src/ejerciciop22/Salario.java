package ejerciciop22;

public class Salario {
    double horas,shoras;
    Salario(double horas, double shoras){
        this.horas = horas;
        this.shoras = shoras;
    }
    double calcular_Salario(){
        return horas*shoras;
    }
}
