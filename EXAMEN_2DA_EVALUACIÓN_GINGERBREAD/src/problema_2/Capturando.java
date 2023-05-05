package problema_2;

//interface con métodos getter y setter que se implementa en la clase abstracta Empleados
public interface Capturando {

    //métodos get y set para los atributos
    void setNombre(String nombre);

    String getNombre();

    void setApellido(String apellido);

    String getApellido();

    void setEdad(int edad);

    int getEdad();

    void setSalarioBase(double salarioBase);

    double getSalarioBase();
}
