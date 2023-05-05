package problema_2;

//Clase Manufactura extiende de la clase abstracta Empleados
public class Manufactura extends Empleados {

    //constructor default
    public Manufactura() {
        super();
        this.setSalarioBase(40.0);//se establece el salario base
    }

    //constructor con parámetros
    public Manufactura(String nombre, String apellido, int edad, double salarioBase) {
        super(nombre, apellido, edad, salarioBase);
    }

    //override del método calcularSalario de la clase abstracta Empleados
    @Override
    public double calcularSalario() {
        int horasSemanales = 60;//horas que el empleado tiene que trabajar por semana
        double salarioTotal = this.getSalarioBase() * horasSemanales;///el salario total es el producto 
        //del salario base por las horas semanales
        return salarioTotal;
    }

}
