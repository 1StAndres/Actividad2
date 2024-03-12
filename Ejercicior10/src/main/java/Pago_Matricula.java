
public class Pago_Matricula {
    int estrato;
    double patrimonio,valort;
    Pago_Matricula(int estrato,double patrimonio){
        this.estrato = estrato;
        this.patrimonio = patrimonio;
    }
    double Valor_Matricula(){
        if((estrato>3)&&(patrimonio>2000000)){
            return 50000+(patrimonio*0.03);
        }
        return 50000;
    }
}
