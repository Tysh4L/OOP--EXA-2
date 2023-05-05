package problema_3;

//Administrador extiende de la clase
//abstracta Empleados
public class Administrador extends Empleados implements ElegibleParaBono{
    //atributo

    private double porcentajeDelBono;

    //constructor deafult
    public Administrador() {
        super();
        this.porcentajeDelBono = 0.0;
    }
//constructor con parámetros

    public Administrador(int ID, String nombre, double salario, double porcentajeDelBono) {
        super(ID, nombre, salario);
        this.porcentajeDelBono = porcentajeDelBono;
    }

    //override del método calcularBono de la interface ElegibleParaBono
    @Override
    public double calcularBono() {
        return getSalario() * getPorcentajeDelBono();
    }

    //override del método calcularSalario de la clase abstracta Empleados
    @Override
    public double calcularSalario() {
        double salarioTotal = getSalario() + calcularBono();//el salario total es el salario mas el bono
        return salarioTotal;
    }

    //métodos getters and setters
    public double getPorcentajeDelBono() {
        return porcentajeDelBono;
    }

    public void setPorcentajeDelBono(double porcentajeDelBono) {
        this.porcentajeDelBono = porcentajeDelBono;
    }

}
