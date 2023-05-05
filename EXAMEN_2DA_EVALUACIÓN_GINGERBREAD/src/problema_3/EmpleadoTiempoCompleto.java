package problema_3;

            //EmpleadoTiempoCompleto extiende de la clase
            //abstracta Empleados
public class EmpleadoTiempoCompleto extends Empleados {

    //constructor deafult
    public EmpleadoTiempoCompleto() {
        super();
    }
    
    //constructor con parámetros
    public EmpleadoTiempoCompleto(int ID, String nombre, double salario) {
        super(ID, nombre, salario);
    }

    //override del método calcularSalario de la clase abstracta Empleados
    @Override
    public double calcularSalario() {
        return this.getSalario(); //regresa el salario fijo del empleado
    }

}
