package problema_2;

public class Problema_2 {

    public static void main(String[] args) {

        //objetos de los empleados de manufactura:
        Manufactura empleadoM1 = new Manufactura();
        Empleados.imprimirSalario(empleadoM1);

        Manufactura empleadoM2 = new Manufactura("Alan", "Rivas", 19, 5.0);
        Empleados.imprimirSalario(empleadoM2);

        //objetos de los empleados de apoyo:
        Apoyo empleadoA1 = new Apoyo();
        Empleados.imprimirSalario(empleadoA1);

        Apoyo empleadoA2 = new Apoyo("Diego", "Vazquez", 29, 25.0);
        Empleados.imprimirSalario(empleadoA2);

        //objetos de los jefes:
        Jefe jefe1 = new Jefe();
        Empleados.imprimirSalario(jefe1);

        Jefe jefe2 = new Jefe("Danna", "Lopez", 20, 10000.0);
        Empleados.imprimirSalario(jefe2);
    }

}
