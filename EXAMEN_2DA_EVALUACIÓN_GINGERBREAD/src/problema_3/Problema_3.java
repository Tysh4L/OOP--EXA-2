package problema_3;

public class Problema_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Administrador empleado = new Administrador(22550340, "Diego Vazquez", 1000000.0, 0.15);
        System.out.println("Empleado: " + empleado.getNombre() + " (ID: " + empleado.getID() + ")");
        System.out.println("Salario: $" + empleado.getSalario());
        System.out.println("Porcentaje de bono: " + empleado.getPorcentajeDelBono() + "%");
        System.out.println("Salario con bono: $" + (empleado.calcularSalario() + empleado.calcularBono()));
    }
}
