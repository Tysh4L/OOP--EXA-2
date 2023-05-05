package problema_1;

public class Formula_1 extends Movimiento{
    
    //Constructor default sin parametros
    public Formula_1() {
        super();
    }

    //Constructor con parametros de velocidad inicial, aceleracion y tiempo.
    public Formula_1(double V0, double a, double t) { //eliminamos la Vf
        super(V0, 0.0, a, t); //Llamamos al constructor de la super clase 
                                               //Establecemos el valor de la Vf en 0.0 ya que esta no es utilizada en esta formula
    }
    
    
    @Override
    public double CalcularDistancia() {
        double resu; //creamos una variable resu
        resu= (getV0()*getT())+((getA()*Math.pow(getT(),2))/2); //resu es igual a la formula para calcular distancia
        return resu; //retornamos la variable resu
    }

}
