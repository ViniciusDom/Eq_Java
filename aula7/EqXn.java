package aula7;

import java.lang.Math;

public class EqXn extends Equacao {
    private double xn;
    private double xp;

//#region metodo de acesso
    public double getXn() {
        return xn;
    }
    public void setXn(double xn) {
        this.xn = xn;
    }
    public double getXp() {
        return xp;
    }
    public void setXp(double xp) {
        this.xp = xp;
    }
//#endregion
//#region regras de negócio
    public void calculaXn () {
    
    }    
    public void calculaXp() {
        
    }
//#endregion
public double calculaXn(Delta d){
    xn = (-d.getB()-Math.sqrt(d.getDelta()))/(2*d.getA());
    return xn;
}

public double calculaXp(Delta d){
    xp = (-d.getB() + Math.sqrt(d.getDelta())) / (2*d.getA());
    return xp;
}
//#endregion regras de negocio



}
