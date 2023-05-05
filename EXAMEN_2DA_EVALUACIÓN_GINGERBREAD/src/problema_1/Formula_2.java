package problema_1;

public class Formula_2 extends Movimiento{

    //Constructor default sin parametros
    public Formula_2() {
        super();
    }

    //Contructor con parametros de velocidad inicial, velocidad final y tiempo
    public Formula_2(double V0, double Vf,  double t) { //eliminamos double a del constructor
        super(V0, Vf, 0.0, t); //llamamos al constructor de la super clase 
                                               //establecemos el valor de la a en 0.0 ya que esta no es utilizada en esta formula
    }
    
    @Override
    //Aplicamos la formula
    public double CalcularDistancia() {
        double resu; //creamos una variable resu
        resu =  ((getV0() + getVf())/2) * getT(); //resu es igual a las formula
        return resu; //retornamos el valor que imprime el resultado
    }
    
}
