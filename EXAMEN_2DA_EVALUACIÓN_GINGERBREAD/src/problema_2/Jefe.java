package problema_2;

//Clase Jefe extiende de la clase abstracta Empleados
public class Jefe extends Empleados {

    //constructor default
    public Jefe() {
        super();
        this.setSalarioBase(5000.0);//se establece el salario de los jefes
    }

    //constructor con parámetros
    public Jefe(String nombre, String apellido, int edad, double salarioBase) {
        super(nombre, apellido, edad, salarioBase);
    }

    //override del método calcularSalario de la clase abstracta Empleados
    @Override
    public double calcularSalario() {
        return this.getSalarioBase();//se retorna solo el salario base
        //ya que los jefes no ganan por hora como los otros empleados
    }

}
