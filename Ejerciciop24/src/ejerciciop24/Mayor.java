package ejerciciop24;
public class Mayor {
    double pea,peb,pec;
    Mayor(double pea, double peb, double pec){
        this.pea = pea;
        this.peb = peb;
        this.pec = pec;
    }
    String Masgrande(){
        if ((pea>peb)&&(pea>pec)){
            return "La esfera A es la de mayor peso";
        }
        else if ((pea<peb)&&(peb>pec)){
            return "La esfera B es la de mayor peso";
        }
        else{
            return "La esfera C es la de mayor peso";
        }
    }
}
