package problema_1;

public class Problema_1 {

    public static void main(String[] args) {
        
        
        // Objetos que utilizan las formula 1, 2 y 3
        Formula_1 formula1 = new Formula_1(15.0, 10.0, 1.0);
        System.out.println("Distancia con formula 1: " + formula1.CalcularDistancia());
        
    
        Formula_2 formula2 = new Formula_2(15.0, 40.0, 1.0);
        System.out.println("Distancia con formula 2: " + formula2.CalcularDistancia());
        
    
        Formula_3 formula3 = new Formula_3(15.0, 40.0, 10.0);
        System.out.println("Distancia con formula 3: " + formula3.CalcularDistancia());
        
    }
   
    
}
