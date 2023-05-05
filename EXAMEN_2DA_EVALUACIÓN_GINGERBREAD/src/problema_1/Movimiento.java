package problema_1;

import problema_1.Captura;

public abstract class Movimiento implements Captura{
    //Atributos
    private double V0; //velocidad inicial
    private double Vf; //velocidad final
    private double a; //aceleracion
    private double t; //tiempo

    //Constructor SIN PARAMETROS
    public Movimiento() {
        this.V0 = 0;
        this.Vf = 0;
        this.a = 1;
        this.t = 0;
    }

    //Constructor CON PARAMETROS
    public Movimiento(double V0, double Vf, double a, double t) {
        this.V0 = V0;
        this.Vf = Vf;
        this.a = a;
        this.t = t;
    }
    
    //Metodo CalcularDistancia
    public abstract double CalcularDistancia();

    //Metodos getter y setter implementados de Captura
    @Override
    public double getV0() {
        return V0;
    }

    @Override
    public void setV0(double V0) {
        this.V0 = V0;
    }

    @Override
    public double getVf() {
        return Vf;
    }

    @Override
    public void setVf(double Vf) {
        this.Vf = Vf;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getT() {
        return t;
    }

    @Override
    public void setT(double t) {
        this.t = t;
    }     
    
}
