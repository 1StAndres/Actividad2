package ejercicior11;

public class Mayor {
    double numa,numb,numc,mayor;
    Mayor(double numa,double numb,double numc){
        this.numa = numa;
        this.numb = numb;
        this.numc = numc;
    }
    double Mas_Grande(){
        mayor=numa;
        if (numa<numb){
            mayor=numb;
            if (numb<numc){
                mayor=numc;
            }
        }
        else if (numa<numc){
            mayor=numc;
        }
        return mayor;
    }
}
