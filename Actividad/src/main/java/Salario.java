
public class Salario {
    double horas,shoras,tretencion;
    Salario(double horas, double shoras, double tretencion){
        this.horas = horas;
        this.shoras = shoras;
        this.tretencion = tretencion;
    }
    double calcular_Sbruto(){
        return horas*shoras;
    }
    double retencion(){
        return (horas*shoras)*tretencion;
    }
    double sneto(){
        return (horas*shoras)-((horas*shoras)*tretencion);
    }
    
}
