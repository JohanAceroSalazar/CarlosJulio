package condicionalesCompuestos;

public class exercise7 {
    public static void main(String[] args) {
        double number1 = 14;
        double number2 = 0;

        if(number2 != 0){ 
            double result = number1 / number2;
            System.out.println("Resultado de la división: " + result);
        } 
        else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}