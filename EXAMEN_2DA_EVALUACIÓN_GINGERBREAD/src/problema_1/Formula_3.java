package problema_1;

public class Formula_3 extends Movimiento{

     // Constructor default sin parametros
    public Formula_3() {
        super();
    }

    // Contructor con parametros de velocidad inicial, velocidad final y tiempo
    public Formula_3(double V0, double Vf, double a) { //eliminamos la variable t
    super(V0, Vf, a, 0.0); //llamamos al constructor de la super clase 
                                            //establecemos el valor de la t en 0.0 ya que esta no es utilizada en esta formula
    }


    @Override
    public double CalcularDistancia() {
        double resu;//creamos una variable resu
        resu = (getVf() - getV0())/(2 * getA()); //resu es igual a la formula para calcular distancia
        return resu; //retornamos la variable resu
    }
    
    
    
}
