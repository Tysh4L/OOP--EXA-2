package problema_3;

public abstract class Empleados {

    private int ID;
    private String nombre;
    private double salario;

    //constructor deafult
    public Empleados() {
        this.ID = 0;
        this.nombre = "--";
        this.salario = 0.0;
    }

    //constructor con parámetros
    public Empleados(int ID, String nombre, double salario) {
        this.ID = ID;
        this.nombre = nombre;
        this.salario = salario;
    }

    // método abstracto para calcular salario
    public abstract double calcularSalario();

    //métodos getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
