package problema_2;

//Clase Apoyo extiende de la clase abstracta Empleados
public class Apoyo extends Empleados {

    //constructor default
    public Apoyo() {
        super();
        this.setSalarioBase(50.0);
    }

    //constructor con parámetros
    public Apoyo(String nombre, String apellido, int edad, double salarioBase) {
        super(nombre, apellido, edad, salarioBase);
    }

    //override del método calcularSalario de la clase abstracta Empleados
    @Override
    public double calcularSalario() {
        int horasSemanales = 50;
        double salarioSemanal = horasSemanales * this.getSalarioBase();//el salario semanal es igual a las horas multiplicadas por el salario base
        double compen = salarioSemanal * 0.5;//debido al turno se establece una compensasion.
        double salarioTotal = salarioSemanal + compen;//el salario total es la suma del semanal y la compensasión
        return salarioTotal;//se duevuelve el salarioTotal
    }

}
