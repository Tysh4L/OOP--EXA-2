package problema_3;

//EmpleadoTiempoParcial extiende de la clase
//abstracta Empleados
public class EmpleadoTiempoParcial extends Empleados {

    //atributos
    private double pagoPorHora;
    private int horasTrabajadas;

    //constructor deafult
    public EmpleadoTiempoParcial() {
        super();
        this.pagoPorHora = 0.0;
        this.horasTrabajadas = 0;
    }

    //constructor con parámetros
    public EmpleadoTiempoParcial(int ID, String nombre, double salario, double pagoPorHora, int horasTrabajadas) {
        super(ID, nombre, salario);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    //override del método calcularSalario de la clase abstracta Empleados
    @Override
    public double calcularSalario() {
        double salarioTotal = getPagoPorHora() * getHorasTrabajadas(); //calculo del salario total;
        //multiplicando las horas trabajadas por el pago por hora
        return salarioTotal;
    }

    //métodos getters and setters
    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

}
