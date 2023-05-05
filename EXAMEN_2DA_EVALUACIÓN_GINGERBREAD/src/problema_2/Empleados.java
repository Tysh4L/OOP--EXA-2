package problema_2;

//Clase abstracta Empleados implementa la interface Capturando
public abstract class Empleados implements Capturando {

    //atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double salarioBase;

    //constructor default
    public Empleados() {
        this.nombre = "--";
        this.apellido = "--";
        this.edad = 0;
        this.salarioBase = 0.0;
    }

    //constructor con parámetros
    public Empleados(String nombre, String apellido, int edad, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    //método que permite calcular el salario 
    //cuando esta clase es heredada por las otras clases
    public abstract double calcularSalario();

    //método estático que permite imprimir el salario
    //de un objeto creado de cualquier clase
    public static void imprimirSalario(Empleados empleados) {
        System.out.println("SALARIO\nEmpleado: " + empleados.getNombre()
                + " " + empleados.getApellido() + "\n" + "Salario semanal: " + "$" + empleados.calcularSalario());
    }

    //métodos getters and setters implementados desde la interface
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
